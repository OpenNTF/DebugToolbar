
var dBarHelper = {
	
	renderInspectorContents: function(){
		
		try {
			
			//reset exception- and expression info
			viewScope.remove( 'exception' );
			viewScope.remove( 'expressionInfo' );			
				
			var expression:string = dBar.getInspectorExpression();
			if( !expression ){ return; }
			
			//don't execute expression if parameters need to be set first
			var pattern = java.util.regex.Pattern.compile("\\((.*?)\\)", java.util.regex.Pattern.DOTALL);
			var matcher = pattern.matcher( expression );
			while(matcher.find()) {
				var match = @Trim(matcher.group(1));
				if (!@Left(match,1).equals("\"") && !@Right(match,1).equals("\"") ) {
					//not something in quotes
					if (match.indexOf(".")>-1 || match.indexOf("int")>-1 || match.indexOf("boolean")>-1 || match.indexOf("long")>-1) {
						eu.linqed.debugtoolbar.DebugToolbar.addInspectorMessage("Edit parameters and click 'Enter' to execute this expression");
						view.postScript("dojo.byId(\"" + getClientId("inputExpression") + "\").focus();");
						return;
					}
				}
			}

			var expressionObj, expressionClass, expressionValue, exceptionString;	
			
			// Test expression as an expression
			try {
				// Fix for expression being interpreted as string
				expressionObj = eval( "var foo;" + expression );
				expressionValue = expressionObj.toString();
				expressionClass = expressionObj.getClass();

			} catch (e) {
				
				try {	//test as a class, but check first if it has a class 'syntax'
				
					if (expression.indexOf("(")>-1) {
						eu.linqed.debugtoolbar.DebugToolbar.addInspectorMessage("Expression executed" + (expressionObj == null ? " (null returned)" : "") + ": " + expression);
						
					} else {
				
						exceptionString = this.getExceptionString( e );
						expressionClass = eval( 'new ' + expression + '()' ).getClass();
						exceptionString = ''; //Reset in case evaluation is OK
					}
						
				} catch(e){		

					exceptionString = this.getExceptionString( e );
					
					try { // Try expression as Class without constructor
						expressionClass = java.lang.Class.forName( expression );
						exceptionString = ''; //Reset in case evaluation is OK
					} catch (e) {
						exceptionString = this.getExceptionString( e );
					}
				}
			}
			
			if( expressionClass ){ 
				className = expressionClass.getName(); }
			else {	
				if( !exceptionString ){ exceptionString = 'No class found for ' + expression; }
			}
			
			if( exceptionString ){
				
				viewScope.put( 'expressionInfo', "" );		
				eu.linqed.debugtoolbar.DebugToolbar.addInspectorMessage(exceptionString);
				
			} else {				
				viewScope.put( 'expressionInfo', {
					className: className,	
					value: expressionValue
				});

			}
			
		} catch( e ){
			viewScope.put( 'expressionInfo', '' );
			dBar.error(e, "inspector");
		}	
	},
	
	getClassItems : function( className, type) {
		try {
			var expression = dBar.getInspectorExpression();
			if( !expression ){ return; }
				
			var expressionObj, expressionClass	
			
			try {
				// Fix for expression being interpreted as string
				expressionObj = eval( 'var foo;' + expression );						
				expressionClass = expressionObj.getClass();	
			
			} catch(e){
				
				try { // Test expression as a class
					expressionClass = eval( 'new ' + expression + '()' ).getClass();
				} catch(e){					
					try { // Try expression as Class without constructor
						expressionClass = java.lang.Class.forName( expression );
					} catch(e){}
				}
			}
			
			if( expressionClass ){
				return (type=="methods" ? dBar.getSortedMethods(expressionClass) : dBar.getSortedFields(expressionClass) );
			}
			
		} catch( e ){
			dBar.error(e);
		}
		
	},
	
	getExceptionString: function( exception ){
		var errorMessage = exception.message;
		
		if (typeof exception === 'com.ibm.jscript.InterpretException') {
			errorMessage = exception.getNode().getTraceString() + '\n\n' + errorMessage;
		}
		
		return errorMessage;
	}
}