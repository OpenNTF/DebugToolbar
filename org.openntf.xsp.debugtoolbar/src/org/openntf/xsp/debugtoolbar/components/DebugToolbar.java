/*
 * Generated file. 
 * 
 * DebugToolbar.java
 */
package org.openntf.xsp.debugtoolbar.components;

import com.ibm.xsp.page.compiled.AbstractCompiledPage;
import com.ibm.xsp.page.compiled.AbstractCompiledPageDispatcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import com.ibm.xsp.page.compiled.NoSuchComponentException;
import com.ibm.xsp.page.compiled.PageExpressionEvaluator;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import javax.faces.el.MethodBinding;
import com.ibm.xsp.component.FacesPageProvider;
import com.ibm.xsp.resource.ScriptResource;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.UIPanelEx;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.component.UIPassThroughTag;
import com.ibm.xsp.component.UIPassThroughText;
import com.ibm.xsp.component.xp.XspOutputText;
import java.util.Map;
import java.lang.Boolean;
import com.ibm.xsp.component.xp.XspDiv;
import com.ibm.xsp.component.xp.XspOutputLink;
import com.ibm.xsp.component.xp.XspEventHandler;
import com.ibm.xsp.component.xp.XspDataIterator;
import com.ibm.xsp.component.xp.XspTableRow;
import com.ibm.xsp.component.xp.XspTableCell;
import com.ibm.xsp.convert.DateTimeConverter;
import com.ibm.xsp.converter.ConverterMethodBinding;
import java.lang.Class;
import com.ibm.xsp.component.xp.XspSpan;
import com.ibm.xsp.component.xp.XspGraphicImage;
import com.ibm.xsp.component.xp.XspSelectOneMenu;
import com.ibm.xsp.component.UISelectItemEx;
import com.ibm.xsp.component.UISelectItemsEx;
import com.ibm.xsp.component.xp.XspTable;
import com.ibm.xsp.component.xp.XspInputCheckbox;
import com.ibm.xsp.component.xp.XspInputText;
import com.ibm.xsp.component.xp.XspMessages;

@SuppressWarnings("all")
public class DebugToolbar extends AbstractCompiledPageDispatcher{
    
    public DebugToolbar() {
        super("8.5.3");
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new DebugToolbarPage();
    }
    
    protected boolean isCustomControl() {
        return true;
    }

    public static class DebugToolbarPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_MARKUP, // 0 a
            ComponentInfo.EMPTY_MARKUP, // 1 text
            new ComponentInfo(true, new int[]{1}), // 2 style
            ComponentInfo.EMPTY_NORMAL, // 3 text2
            ComponentInfo.EMPTY_NORMAL, // 4 eventHandler
            new ComponentInfo(false, new int[]{4}), // 5 "link8"
            new ComponentInfo(true, new int[]{5}), // 6 li
            new ComponentInfo(true, new int[]{6}), // 7 ul
            new ComponentInfo(false, new int[]{7}), // 8 div
            ComponentInfo.EMPTY_NORMAL, // 9 eventHandler2
            new ComponentInfo(false, new int[]{9}), // 10 "link12"
            new ComponentInfo(true, new int[]{10}), // 11 li2
            ComponentInfo.EMPTY_NORMAL, // 12 eventHandler3
            new ComponentInfo(false, new int[]{12}), // 13 "link23"
            new ComponentInfo(true, new int[]{13}), // 14 li3
            new ComponentInfo(true, new int[]{11, 14}), // 15 ul2
            new ComponentInfo(true, new int[]{15}), // 16 div3
            ComponentInfo.EMPTY_NORMAL, // 17 eventHandler4
            new ComponentInfo(false, new int[]{17}), // 18 "linkcollapse"
            new ComponentInfo(true, new int[]{18}), // 19 li4
            ComponentInfo.EMPTY_NORMAL, // 20 eventHandler5
            new ComponentInfo(false, new int[]{20}), // 21 "linktabmessages"
            new ComponentInfo(true, new int[]{21}), // 22 li5
            ComponentInfo.EMPTY_NORMAL, // 23 eventHandler6
            new ComponentInfo(false, new int[]{23}), // 24 "link3"
            new ComponentInfo(true, new int[]{24}), // 25 li6
            ComponentInfo.EMPTY_NORMAL, // 26 eventHandler7
            new ComponentInfo(false, new int[]{26}), // 27 "link2"
            new ComponentInfo(true, new int[]{27}), // 28 li7
            ComponentInfo.EMPTY_NORMAL, // 29 eventHandler8
            new ComponentInfo(false, new int[]{29}), // 30 "link5"
            new ComponentInfo(true, new int[]{30}), // 31 li8
            ComponentInfo.EMPTY_NORMAL, // 32 eventHandler9
            new ComponentInfo(false, new int[]{32}), // 33 "link6"
            new ComponentInfo(true, new int[]{33}), // 34 li9
            ComponentInfo.EMPTY_NORMAL, // 35 eventHandler10
            new ComponentInfo(false, new int[]{35}), // 36 "link1"
            new ComponentInfo(true, new int[]{36}), // 37 li10
            ComponentInfo.EMPTY_NORMAL, // 38 eventHandler11
            new ComponentInfo(false, new int[]{38}), // 39 "link11"
            new ComponentInfo(true, new int[]{39}), // 40 li11
            ComponentInfo.EMPTY_NORMAL, // 41 eventHandler12
            new ComponentInfo(false, new int[]{41}), // 42 "link9"
            new ComponentInfo(true, new int[]{42}), // 43 li12
            new ComponentInfo(true, new int[]{19, 22, 25, 28, 31, 34, 37, 40, 43}), // 44 ul3
            new ComponentInfo(false, new int[]{16, 44}), // 45 div2
            ComponentInfo.EMPTY_NORMAL, // 46 eventHandler13
            new ComponentInfo(false, new int[]{46}), // 47 "linkdrefresh"
            ComponentInfo.EMPTY_MARKUP, // 48 text3
            ComponentInfo.EMPTY_NORMAL, // 49 eventHandler14
            new ComponentInfo(false, new int[]{49}), // 50 "link24"
            ComponentInfo.EMPTY_MARKUP, // 51 text4
            ComponentInfo.EMPTY_NORMAL, // 52 eventHandler15
            new ComponentInfo(false, new int[]{52}), // 53 "link20"
            ComponentInfo.EMPTY_MARKUP, // 54 text5
            ComponentInfo.EMPTY_NORMAL, // 55 eventHandler16
            new ComponentInfo(false, new int[]{55}), // 56 "link33"
            ComponentInfo.EMPTY_NORMAL, // 57 eventHandler17
            new ComponentInfo(false, new int[]{57}), // 58 "link34"
            ComponentInfo.EMPTY_MARKUP, // 59 text6
            ComponentInfo.EMPTY_NORMAL, // 60 eventHandler18
            new ComponentInfo(false, new int[]{60}), // 61 "link21"
            ComponentInfo.EMPTY_MARKUP, // 62 text7
            new ComponentInfo(false, new int[]{62}), // 63 td
            new ComponentInfo(false, new int[]{63}), // 64 tr
            ComponentInfo.EMPTY_NORMAL, // 65 text8
            ComponentInfo.EMPTY_NORMAL, // 66 text9
            new ComponentInfo(false, new int[]{65, 66}), // 67 td2
            ComponentInfo.EMPTY_NORMAL, // 68 text10
            ComponentInfo.EMPTY_NORMAL, // 69 text11
            ComponentInfo.EMPTY_NORMAL, // 70 eventHandler19
            new ComponentInfo(false, new int[]{70}), // 71 "link27"
            ComponentInfo.EMPTY_NORMAL, // 72 eventHandler20
            new ComponentInfo(false, new int[]{72}), // 73 "link29"
            ComponentInfo.EMPTY_MARKUP, // 74 br
            ComponentInfo.EMPTY_NORMAL, // 75 text12
            new ComponentInfo(false, new int[]{71, 73, 74, 75}), // 76 "stacktrace"
            new ComponentInfo(false, new int[]{68, 69, 76}), // 77 td3
            new ComponentInfo(false, new int[]{67, 77}), // 78 tr2
            ComponentInfo.EMPTY_NORMAL, // 79 text13
            ComponentInfo.EMPTY_NORMAL, // 80 text14
            new ComponentInfo(false, new int[]{64, 78}, // 81 "dtmessages"
              new Object[][]{
                new Object[]{"footer", Integer.valueOf(79)},
                new Object[]{"header", Integer.valueOf(80)},
              } ),
            ComponentInfo.EMPTY_NORMAL, // 82 text15
            new ComponentInfo(false, new int[]{47, 48, 50, 51, 53, 54, 56, 58, 59, 61, 81, 82}), // 83 div4
            ComponentInfo.EMPTY_NORMAL, // 84 eventHandler21
            new ComponentInfo(false, new int[]{84}), // 85 "link18"
            ComponentInfo.EMPTY_MARKUP, // 86 text16
            ComponentInfo.EMPTY_NORMAL, // 87 eventHandler22
            new ComponentInfo(false, new int[]{87}), // 88 "link17"
            ComponentInfo.EMPTY_MARKUP, // 89 text17
            ComponentInfo.EMPTY_NORMAL, // 90 eventHandler23
            new ComponentInfo(false, new int[]{90}), // 91 "link22"
            new ComponentInfo(false, new int[]{86, 88, 89, 91}), // 92 span
            ComponentInfo.EMPTY_MARKUP, // 93 text18
            ComponentInfo.EMPTY_NORMAL, // 94 eventHandler24
            new ComponentInfo(false, new int[]{94}), // 95 "link14"
            ComponentInfo.EMPTY_NORMAL, // 96 eventHandler25
            new ComponentInfo(false, new int[]{96}), // 97 "link16"
            ComponentInfo.EMPTY_MARKUP, // 98 text19
            new ComponentInfo(false, new int[]{98}), // 99 div6
            ComponentInfo.EMPTY_NORMAL, // 100 eventHandler26
            ComponentInfo.EMPTY_NORMAL, // 101 "image2"
            new ComponentInfo(false, new int[]{100, 101}), // 102 "link26"
            ComponentInfo.EMPTY_MARKUP, // 103 text20
            ComponentInfo.EMPTY_NORMAL, // 104 eventHandler27
            ComponentInfo.EMPTY_NORMAL, // 105 "image1"
            new ComponentInfo(false, new int[]{104, 105}), // 106 "link25"
            new ComponentInfo(true, new int[]{102, 103, 106}), // 107 div7
            ComponentInfo.EMPTY_NORMAL, // 108 text21
            new ComponentInfo(true, new int[]{107, 108}), // 109 td4
            ComponentInfo.EMPTY_NORMAL, // 110 text22
            new ComponentInfo(true, new int[]{110}), // 111 td5
            new ComponentInfo(true, new int[]{109, 111}), // 112 tr3
            ComponentInfo.EMPTY_NORMAL, // 113 text23
            ComponentInfo.EMPTY_NORMAL, // 114 text24
            new ComponentInfo(false, new int[]{112}, // 115 "repeatscope"
              new Object[][]{
                new Object[]{"footer", Integer.valueOf(113)},
                new Object[]{"header", Integer.valueOf(114)},
              } ),
            new ComponentInfo(false, new int[]{85, 92, 93, 95, 97, 99, 115}), // 116 div5
            ComponentInfo.EMPTY_MARKUP, // 117 text25
            new ComponentInfo(true, new int[]{117}), // 118 strong
            ComponentInfo.EMPTY_MARKUP, // 119 text26
            ComponentInfo.EMPTY_NORMAL, // 120 selectItem
            ComponentInfo.EMPTY_NORMAL, // 121 selectItems
            ComponentInfo.EMPTY_NORMAL, // 122 eventHandler28
            new ComponentInfo(false, new int[]{120, 121, 122}), // 123 "comboboxlogfile"
            ComponentInfo.EMPTY_MARKUP, // 124 text27
            ComponentInfo.EMPTY_NORMAL, // 125 eventHandler29
            new ComponentInfo(false, new int[]{125}), // 126 "link37"
            ComponentInfo.EMPTY_MARKUP, // 127 text28
            new ComponentInfo(true, new int[]{127}), // 128 strong2
            ComponentInfo.EMPTY_MARKUP, // 129 text29
            ComponentInfo.EMPTY_NORMAL, // 130 text30
            ComponentInfo.EMPTY_NORMAL, // 131 eventHandler30
            new ComponentInfo(false, new int[]{131}), // 132 "link41"
            ComponentInfo.EMPTY_NORMAL, // 133 text31
            new ComponentInfo(false, new int[]{132, 133}), // 134 "repeat1"
            new ComponentInfo(true, new int[]{128, 129, 130, 134}), // 135 span2
            new ComponentInfo(true, new int[]{118, 119, 123, 124, 126, 135}), // 136 div8
            ComponentInfo.EMPTY_MARKUP, // 137 text32
            ComponentInfo.EMPTY_NORMAL, // 138 eventHandler31
            new ComponentInfo(false, new int[]{138}), // 139 "link40"
            ComponentInfo.EMPTY_MARKUP, // 140 text33
            new ComponentInfo(false, new int[]{137, 139, 140}), // 141 div9
            ComponentInfo.EMPTY_NORMAL, // 142 text34
            new ComponentInfo(false, new int[]{141, 142}), // 143 "logfilecontents"
            new ComponentInfo(false, new int[]{136, 143}), // 144 "logfiles"
            ComponentInfo.EMPTY_MARKUP, // 145 text35
            new ComponentInfo(true, new int[]{145}), // 146 div12
            ComponentInfo.EMPTY_MARKUP, // 147 text36
            new ComponentInfo(true, new int[]{147}), // 148 th
            new ComponentInfo(true, new int[]{148}), // 149 tr4
            ComponentInfo.EMPTY_NORMAL, // 150 text37
            new ComponentInfo(true, new int[]{150}), // 151 td6
            ComponentInfo.EMPTY_NORMAL, // 152 text38
            new ComponentInfo(true, new int[]{152}), // 153 td7
            new ComponentInfo(true, new int[]{151, 153}), // 154 tr5
            new ComponentInfo(false, new int[]{154}), // 155 "repeat3"
            ComponentInfo.EMPTY_MARKUP, // 156 text39
            new ComponentInfo(true, new int[]{156}), // 157 th2
            new ComponentInfo(true, new int[]{157}), // 158 tr6
            ComponentInfo.EMPTY_NORMAL, // 159 text40
            new ComponentInfo(true, new int[]{159}), // 160 td8
            ComponentInfo.EMPTY_NORMAL, // 161 text41
            new ComponentInfo(true, new int[]{161}), // 162 td9
            new ComponentInfo(true, new int[]{160, 162}), // 163 tr7
            new ComponentInfo(false, new int[]{163}), // 164 "repeat4"
            ComponentInfo.EMPTY_MARKUP, // 165 text42
            new ComponentInfo(true, new int[]{165}), // 166 th3
            new ComponentInfo(true, new int[]{166}), // 167 tr8
            ComponentInfo.EMPTY_NORMAL, // 168 text43
            new ComponentInfo(true, new int[]{168}), // 169 td10
            ComponentInfo.EMPTY_NORMAL, // 170 text44
            new ComponentInfo(true, new int[]{170}), // 171 td11
            new ComponentInfo(true, new int[]{169, 171}), // 172 tr9
            new ComponentInfo(false, new int[]{172}), // 173 "repeat6"
            ComponentInfo.EMPTY_MARKUP, // 174 text45
            new ComponentInfo(true, new int[]{174}), // 175 th4
            new ComponentInfo(true, new int[]{175}), // 176 tr10
            ComponentInfo.EMPTY_NORMAL, // 177 text46
            new ComponentInfo(true, new int[]{177}), // 178 td12
            ComponentInfo.EMPTY_NORMAL, // 179 text47
            new ComponentInfo(true, new int[]{179}), // 180 td13
            new ComponentInfo(true, new int[]{178, 180}), // 181 tr11
            new ComponentInfo(false, new int[]{181}), // 182 "repeat5"
            ComponentInfo.EMPTY_MARKUP, // 183 text48
            new ComponentInfo(true, new int[]{183}), // 184 td14
            ComponentInfo.EMPTY_NORMAL, // 185 eventHandler32
            new ComponentInfo(false, new int[]{185}), // 186 "link38"
            ComponentInfo.EMPTY_MARKUP, // 187 text49
            new ComponentInfo(true, new int[]{186, 187}), // 188 td15
            new ComponentInfo(false, new int[]{184, 188}), // 189 tr12
            ComponentInfo.EMPTY_MARKUP, // 190 text50
            new ComponentInfo(true, new int[]{190}), // 191 th5
            new ComponentInfo(true, new int[]{191}), // 192 tr13
            ComponentInfo.EMPTY_NORMAL, // 193 text51
            new ComponentInfo(true, new int[]{193}), // 194 td16
            ComponentInfo.EMPTY_NORMAL, // 195 text52
            new ComponentInfo(true, new int[]{195}), // 196 td17
            new ComponentInfo(true, new int[]{194, 196}), // 197 tr14
            new ComponentInfo(false, new int[]{197}), // 198 "repeat7"
            new ComponentInfo(true, new int[]{149, 155, 158, 164, 167, 173, 176, 182, 189, 192, 198}), // 199 tbody
            new ComponentInfo(true, new int[]{199}), // 200 table
            new ComponentInfo(true, new int[]{146, 200}), // 201 div11
            ComponentInfo.EMPTY_MARKUP, // 202 text53
            new ComponentInfo(true, new int[]{202}), // 203 div14
            ComponentInfo.EMPTY_MARKUP, // 204 text54
            new ComponentInfo(true, new int[]{204}), // 205 td18
            ComponentInfo.EMPTY_NORMAL, // 206 "computedfield3"
            new ComponentInfo(true, new int[]{206}), // 207 td19
            new ComponentInfo(true, new int[]{205, 207}), // 208 tr15
            ComponentInfo.EMPTY_MARKUP, // 209 text55
            new ComponentInfo(true, new int[]{209}), // 210 td20
            ComponentInfo.EMPTY_NORMAL, // 211 "computedfield8"
            ComponentInfo.EMPTY_NORMAL, // 212 "link36"
            ComponentInfo.EMPTY_NORMAL, // 213 "image3"
            new ComponentInfo(true, new int[]{211, 212, 213}), // 214 td21
            new ComponentInfo(true, new int[]{210, 214}), // 215 tr16
            ComponentInfo.EMPTY_MARKUP, // 216 text56
            new ComponentInfo(true, new int[]{216}), // 217 td22
            ComponentInfo.EMPTY_NORMAL, // 218 text57
            new ComponentInfo(true, new int[]{218}), // 219 td23
            new ComponentInfo(true, new int[]{217, 219}), // 220 tr17
            new ComponentInfo(true, new int[]{208, 215, 220}), // 221 tbody2
            new ComponentInfo(true, new int[]{221}), // 222 table2
            ComponentInfo.EMPTY_MARKUP, // 223 text58
            ComponentInfo.EMPTY_MARKUP, // 224 text59
            new ComponentInfo(true, new int[]{224}), // 225 a2
            ComponentInfo.EMPTY_MARKUP, // 226 text60
            new ComponentInfo(true, new int[]{223, 225, 226}), // 227 div15
            ComponentInfo.EMPTY_MARKUP, // 228 text61
            new ComponentInfo(true, new int[]{228}), // 229 div16
            ComponentInfo.EMPTY_NORMAL, // 230 text62
            ComponentInfo.EMPTY_NORMAL, // 231 text63
            new ComponentInfo(true, new int[]{231}), // 232 tbody3
            new ComponentInfo(true, new int[]{232}), // 233 table3
            new ComponentInfo(true, new int[]{233}), // 234 div17
            ComponentInfo.EMPTY_NORMAL, // 235 eventHandler33
            new ComponentInfo(false, new int[]{235}), // 236 "link28"
            new ComponentInfo(true, new int[]{236}), // 237 div18
            new ComponentInfo(false, new int[]{229, 230, 234, 237}), // 238 "java"
            new ComponentInfo(true, new int[]{203, 222, 227, 238}), // 239 div13
            ComponentInfo.EMPTY_MARKUP, // 240 br2
            new ComponentInfo(false, new int[]{201, 239, 240}), // 241 div10
            ComponentInfo.EMPTY_MARKUP, // 242 text64
            new ComponentInfo(true, new int[]{242}), // 243 strong3
            ComponentInfo.EMPTY_MARKUP, // 244 br3
            ComponentInfo.EMPTY_MARKUP, // 245 text65
            ComponentInfo.EMPTY_NORMAL, // 246 eventHandler34
            new ComponentInfo(false, new int[]{246}), // 247 "link15"
            ComponentInfo.EMPTY_NORMAL, // 248 eventHandler35
            new ComponentInfo(false, new int[]{248}), // 249 "link30"
            ComponentInfo.EMPTY_MARKUP, // 250 text66
            new ComponentInfo(true, new int[]{243, 244, 245, 247, 249, 250}), // 251 td24
            ComponentInfo.EMPTY_NORMAL, // 252 selectItem2
            ComponentInfo.EMPTY_NORMAL, // 253 selectItems2
            ComponentInfo.EMPTY_NORMAL, // 254 eventHandler36
            new ComponentInfo(false, new int[]{252, 253, 254}), // 255 "componentid"
            ComponentInfo.EMPTY_MARKUP, // 256 text67
            ComponentInfo.EMPTY_NORMAL, // 257 eventHandler37
            new ComponentInfo(false, new int[]{257}), // 258 "chkshowhiddencontrols"
            ComponentInfo.EMPTY_MARKUP, // 259 br4
            ComponentInfo.EMPTY_NORMAL, // 260 eventHandler38
            new ComponentInfo(false, new int[]{260}), // 261 "link19"
            new ComponentInfo(false, new int[]{261}), // 262 "repeat2"
            new ComponentInfo(true, new int[]{255, 256, 258, 259, 262}), // 263 td25
            ComponentInfo.EMPTY_MARKUP, // 264 text68
            new ComponentInfo(true, new int[]{264}), // 265 strong4
            new ComponentInfo(true, new int[]{265}), // 266 td26
            ComponentInfo.EMPTY_NORMAL, // 267 selectItem3
            ComponentInfo.EMPTY_NORMAL, // 268 selectItems3
            ComponentInfo.EMPTY_NORMAL, // 269 eventHandler39
            new ComponentInfo(false, new int[]{267, 268, 269}), // 270 "cbprevexp"
            new ComponentInfo(true, new int[]{270}), // 271 td27
            new ComponentInfo(true, new int[]{251, 263, 266, 271}), // 272 tr18
            ComponentInfo.EMPTY_MARKUP, // 273 tr19
            ComponentInfo.EMPTY_MARKUP, // 274 text69
            new ComponentInfo(true, new int[]{274}), // 275 strong5
            new ComponentInfo(true, new int[]{275}), // 276 td28
            ComponentInfo.EMPTY_NORMAL, // 277 eventHandler40
            new ComponentInfo(false, new int[]{277}), // 278 "inputexpression"
            ComponentInfo.EMPTY_MARKUP, // 279 text70
            ComponentInfo.EMPTY_NORMAL, // 280 eventHandler41
            new ComponentInfo(false, new int[]{280}), // 281 "link31"
            ComponentInfo.EMPTY_MARKUP, // 282 br5
            ComponentInfo.EMPTY_MARKUP, // 283 text71
            new ComponentInfo(true, new int[]{283}), // 284 i
            new ComponentInfo(true, new int[]{278, 279, 281, 282, 284}), // 285 td29
            new ComponentInfo(true, new int[]{276, 285}), // 286 tr20
            new ComponentInfo(false, new int[]{272, 273, 286}), // 287 "inspectorheader"
            ComponentInfo.EMPTY_NORMAL, // 288 text72
            new ComponentInfo(true, new int[]{288}), // 289 div19
            ComponentInfo.EMPTY_NORMAL, // 290 text73
            new ComponentInfo(true, new int[]{290}), // 291 div20
            ComponentInfo.EMPTY_NORMAL, // 292 "inspectormessages"
            new ComponentInfo(true, new int[]{292}), // 293 pre
            ComponentInfo.EMPTY_NORMAL, // 294 "link44"
            new ComponentInfo(true, new int[]{294}), // 295 b
            ComponentInfo.EMPTY_MARKUP, // 296 br6
            ComponentInfo.EMPTY_NORMAL, // 297 "expressionvalue"
            new ComponentInfo(false, new int[]{295, 296, 297}), // 298 div21
            ComponentInfo.EMPTY_NORMAL, // 299 eventHandler42
            new ComponentInfo(false, new int[]{299}), // 300 "link35"
            ComponentInfo.EMPTY_NORMAL, // 301 eventHandler43
            new ComponentInfo(false, new int[]{301}), // 302 "link32"
            ComponentInfo.EMPTY_MARKUP, // 303 text74
            ComponentInfo.EMPTY_NORMAL, // 304 eventHandler44
            new ComponentInfo(false, new int[]{304}), // 305 "link10"
            new ComponentInfo(false, new int[]{303, 305}), // 306 span3
            new ComponentInfo(true, new int[]{300, 302, 306}), // 307 div22
            ComponentInfo.EMPTY_NORMAL, // 308 "link7"
            ComponentInfo.EMPTY_NORMAL, // 309 "computedfield4"
            new ComponentInfo(true, new int[]{308, 309}), // 310 td30
            ComponentInfo.EMPTY_NORMAL, // 311 eventHandler45
            new ComponentInfo(false, new int[]{311}), // 312 "link42"
            new ComponentInfo(true, new int[]{312}), // 313 strong6
            ComponentInfo.EMPTY_MARKUP, // 314 text75
            ComponentInfo.EMPTY_NORMAL, // 315 "link43"
            ComponentInfo.EMPTY_NORMAL, // 316 text76
            new ComponentInfo(false, new int[]{315, 316}), // 317 "repeatpm"
            ComponentInfo.EMPTY_MARKUP, // 318 text77
            ComponentInfo.EMPTY_MARKUP, // 319 br7
            ComponentInfo.EMPTY_NORMAL, // 320 text78
            new ComponentInfo(true, new int[]{313, 314, 317, 318, 319, 320}), // 321 td31
            ComponentInfo.EMPTY_NORMAL, // 322 text79
            ComponentInfo.EMPTY_NORMAL, // 323 "linkdeclclass"
            new ComponentInfo(true, new int[]{322, 323}), // 324 td32
            new ComponentInfo(true, new int[]{310, 321, 324}), // 325 tr21
            ComponentInfo.EMPTY_NORMAL, // 326 text80
            new ComponentInfo(false, new int[]{325}, // 327 "repeatmethods"
              new Object[][]{
                new Object[]{"header", Integer.valueOf(326)},
              } ),
            ComponentInfo.EMPTY_NORMAL, // 328 "link45"
            ComponentInfo.EMPTY_NORMAL, // 329 "computedfield5"
            new ComponentInfo(true, new int[]{328, 329}), // 330 td33
            ComponentInfo.EMPTY_NORMAL, // 331 eventHandler46
            new ComponentInfo(false, new int[]{331}), // 332 "link46"
            new ComponentInfo(true, new int[]{332}), // 333 strong7
            new ComponentInfo(true, new int[]{333}), // 334 td34
            ComponentInfo.EMPTY_NORMAL, // 335 link
            ComponentInfo.EMPTY_NORMAL, // 336 text81
            new ComponentInfo(true, new int[]{335, 336}), // 337 td35
            new ComponentInfo(true, new int[]{330, 334, 337}), // 338 tr22
            ComponentInfo.EMPTY_NORMAL, // 339 text82
            new ComponentInfo(false, new int[]{338}, // 340 "repeatfields"
              new Object[][]{
                new Object[]{"header", Integer.valueOf(339)},
              } ),
            new ComponentInfo(false, new int[]{327, 340}), // 341 table4
            new ComponentInfo(false, new int[]{298, 307, 341}), // 342 "expressioninfo"
            new ComponentInfo(false, new int[]{287, 289, 291, 293, 342}), // 343 "inspector"
            ComponentInfo.EMPTY_MARKUP, // 344 img
            new ComponentInfo(true, new int[]{344}), // 345 td36
            ComponentInfo.EMPTY_MARKUP, // 346 text83
            ComponentInfo.EMPTY_NORMAL, // 347 link47
            ComponentInfo.EMPTY_MARKUP, // 348 text84
            ComponentInfo.EMPTY_NORMAL, // 349 link48
            ComponentInfo.EMPTY_MARKUP, // 350 text85
            ComponentInfo.EMPTY_MARKUP, // 351 text86
            new ComponentInfo(true, new int[]{351}), // 352 a3
            ComponentInfo.EMPTY_MARKUP, // 353 text87
            ComponentInfo.EMPTY_MARKUP, // 354 br8
            ComponentInfo.EMPTY_MARKUP, // 355 br9
            ComponentInfo.EMPTY_MARKUP, // 356 text88
            new ComponentInfo(true, new int[]{356}), // 357 a4
            ComponentInfo.EMPTY_MARKUP, // 358 text89
            ComponentInfo.EMPTY_MARKUP, // 359 text90
            new ComponentInfo(true, new int[]{359}), // 360 a5
            ComponentInfo.EMPTY_MARKUP, // 361 text91
            ComponentInfo.EMPTY_MARKUP, // 362 text92
            new ComponentInfo(true, new int[]{362}), // 363 a6
            new ComponentInfo(true, new int[]{346, 347, 348, 349, 350, 352, 353, 354, 355, 357, 358, 360, 361, 363}), // 364 td37
            new ComponentInfo(true, new int[]{345, 364}), // 365 tr23
            ComponentInfo.EMPTY_MARKUP, // 366 text93
            ComponentInfo.EMPTY_MARKUP, // 367 br10
            ComponentInfo.EMPTY_MARKUP, // 368 br11
            ComponentInfo.EMPTY_MARKUP, // 369 text94
            ComponentInfo.EMPTY_MARKUP, // 370 text95
            new ComponentInfo(true, new int[]{370}), // 371 a7
            ComponentInfo.EMPTY_MARKUP, // 372 text96
            ComponentInfo.EMPTY_MARKUP, // 373 br12
            new ComponentInfo(true, new int[]{366, 367, 368, 369, 371, 372, 373}), // 374 td38
            new ComponentInfo(true, new int[]{374}), // 375 tr24
            new ComponentInfo(true, new int[]{365, 375}), // 376 tbody4
            new ComponentInfo(true, new int[]{376}), // 377 table5
            new ComponentInfo(true, new int[]{377}), // 378 div25
            ComponentInfo.EMPTY_MARKUP, // 379 text97
            ComponentInfo.EMPTY_NORMAL, // 380 "link13"
            ComponentInfo.EMPTY_MARKUP, // 381 text98
            new ComponentInfo(true, new int[]{379, 380, 381}), // 382 p
            new ComponentInfo(false, new int[]{378, 382}), // 383 div24
            new ComponentInfo(false, new int[]{383}), // 384 div23
            new ComponentInfo(false, new int[]{83, 116, 144, 241, 343, 384}), // 385 "toolbarcontents"
            ComponentInfo.EMPTY_NORMAL, // 386 "link39"
            new ComponentInfo(true, new int[]{386}), // 387 li13
            ComponentInfo.EMPTY_NORMAL, // 388 eventHandler47
            new ComponentInfo(false, new int[]{388}), // 389 "link4"
            new ComponentInfo(true, new int[]{389}), // 390 li14
            new ComponentInfo(true, new int[]{387, 390}), // 391 ul4
            new ComponentInfo(false, new int[]{391}), // 392 div26
            new ComponentInfo(false, new int[]{8, 45, 385, 392}), // 393 "debugtoolbar"
            new ComponentInfo(false, new int[]{0, 2, 3, 393}), // 394 panel
            new ComponentInfo(false, new int[]{394}), // 395 view
        };
        
        public DebugToolbarPage() {
            super(395, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "debugtoolbar".equals(id) )
                return 393;
            if( "link8".equals(id) )
                return 5;
            if( "link12".equals(id) )
                return 10;
            if( "link23".equals(id) )
                return 13;
            if( "linkcollapse".equals(id) )
                return 18;
            if( "linktabmessages".equals(id) )
                return 21;
            if( "link3".equals(id) )
                return 24;
            if( "link2".equals(id) )
                return 27;
            if( "link5".equals(id) )
                return 30;
            if( "link6".equals(id) )
                return 33;
            if( "link1".equals(id) )
                return 36;
            if( "link11".equals(id) )
                return 39;
            if( "link9".equals(id) )
                return 42;
            if( "toolbarcontents".equals(id) )
                return 385;
            if( "linkdrefresh".equals(id) )
                return 47;
            if( "link24".equals(id) )
                return 50;
            if( "link20".equals(id) )
                return 53;
            if( "link33".equals(id) )
                return 56;
            if( "link34".equals(id) )
                return 58;
            if( "link21".equals(id) )
                return 61;
            if( "dtmessages".equals(id) )
                return 81;
            if( "stacktrace".equals(id) )
                return 76;
            if( "link27".equals(id) )
                return 71;
            if( "link29".equals(id) )
                return 73;
            if( "link18".equals(id) )
                return 85;
            if( "link17".equals(id) )
                return 88;
            if( "link22".equals(id) )
                return 91;
            if( "link14".equals(id) )
                return 95;
            if( "link16".equals(id) )
                return 97;
            if( "repeatscope".equals(id) )
                return 115;
            if( "link26".equals(id) )
                return 102;
            if( "image2".equals(id) )
                return 101;
            if( "link25".equals(id) )
                return 106;
            if( "image1".equals(id) )
                return 105;
            if( "logfiles".equals(id) )
                return 144;
            if( "comboboxlogfile".equals(id) )
                return 123;
            if( "link37".equals(id) )
                return 126;
            if( "repeat1".equals(id) )
                return 134;
            if( "link41".equals(id) )
                return 132;
            if( "logfilecontents".equals(id) )
                return 143;
            if( "link40".equals(id) )
                return 139;
            if( "repeat3".equals(id) )
                return 155;
            if( "repeat4".equals(id) )
                return 164;
            if( "repeat6".equals(id) )
                return 173;
            if( "repeat5".equals(id) )
                return 182;
            if( "link38".equals(id) )
                return 186;
            if( "repeat7".equals(id) )
                return 198;
            if( "computedfield3".equals(id) )
                return 206;
            if( "computedfield8".equals(id) )
                return 211;
            if( "link36".equals(id) )
                return 212;
            if( "image3".equals(id) )
                return 213;
            if( "java".equals(id) )
                return 238;
            if( "link28".equals(id) )
                return 236;
            if( "inspector".equals(id) )
                return 343;
            if( "inspectorheader".equals(id) )
                return 287;
            if( "link15".equals(id) )
                return 247;
            if( "link30".equals(id) )
                return 249;
            if( "componentid".equals(id) )
                return 255;
            if( "chkshowhiddencontrols".equals(id) )
                return 258;
            if( "repeat2".equals(id) )
                return 262;
            if( "link19".equals(id) )
                return 261;
            if( "cbprevexp".equals(id) )
                return 270;
            if( "inputexpression".equals(id) )
                return 278;
            if( "link31".equals(id) )
                return 281;
            if( "inspectormessages".equals(id) )
                return 292;
            if( "expressioninfo".equals(id) )
                return 342;
            if( "link44".equals(id) )
                return 294;
            if( "expressionvalue".equals(id) )
                return 297;
            if( "link35".equals(id) )
                return 300;
            if( "link32".equals(id) )
                return 302;
            if( "link10".equals(id) )
                return 305;
            if( "repeatmethods".equals(id) )
                return 327;
            if( "link7".equals(id) )
                return 308;
            if( "computedfield4".equals(id) )
                return 309;
            if( "link42".equals(id) )
                return 312;
            if( "repeatpm".equals(id) )
                return 317;
            if( "link43".equals(id) )
                return 315;
            if( "linkdeclclass".equals(id) )
                return 323;
            if( "repeatfields".equals(id) )
                return 340;
            if( "link45".equals(id) )
                return 328;
            if( "computedfield5".equals(id) )
                return 329;
            if( "link46".equals(id) )
                return 332;
            if( "link13".equals(id) )
                return 380;
            if( "link39".equals(id) )
                return 386;
            if( "link4".equals(id) )
                return 389;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 395:
                return createView(context, parent, evaluator);
            case 394:
                return createPanel(context, parent, evaluator);
            case 0:
                return createA(context, parent, evaluator);
            case 2:
                return createStyle(context, parent, evaluator);
            case 1:
                return createText(context, parent, evaluator);
            case 3:
                return createText2(context, parent, evaluator);
            case 393:
                return createDebugtoolbar(context, parent, evaluator);
            case 8:
                return createDiv(context, parent, evaluator);
            case 7:
                return createUl(context, parent, evaluator);
            case 6:
                return createLi(context, parent, evaluator);
            case 5:
                return createLink8(context, parent, evaluator);
            case 4:
                return createEventHandler(context, parent, evaluator);
            case 45:
                return createDiv2(context, parent, evaluator);
            case 16:
                return createDiv3(context, parent, evaluator);
            case 15:
                return createUl2(context, parent, evaluator);
            case 11:
                return createLi2(context, parent, evaluator);
            case 10:
                return createLink12(context, parent, evaluator);
            case 9:
                return createEventHandler2(context, parent, evaluator);
            case 14:
                return createLi3(context, parent, evaluator);
            case 13:
                return createLink23(context, parent, evaluator);
            case 12:
                return createEventHandler3(context, parent, evaluator);
            case 44:
                return createUl3(context, parent, evaluator);
            case 19:
                return createLi4(context, parent, evaluator);
            case 18:
                return createLinkcollapse(context, parent, evaluator);
            case 17:
                return createEventHandler4(context, parent, evaluator);
            case 22:
                return createLi5(context, parent, evaluator);
            case 21:
                return createLinktabmessages(context, parent, evaluator);
            case 20:
                return createEventHandler5(context, parent, evaluator);
            case 25:
                return createLi6(context, parent, evaluator);
            case 24:
                return createLink3(context, parent, evaluator);
            case 23:
                return createEventHandler6(context, parent, evaluator);
            case 28:
                return createLi7(context, parent, evaluator);
            case 27:
                return createLink2(context, parent, evaluator);
            case 26:
                return createEventHandler7(context, parent, evaluator);
            case 31:
                return createLi8(context, parent, evaluator);
            case 30:
                return createLink5(context, parent, evaluator);
            case 29:
                return createEventHandler8(context, parent, evaluator);
            case 34:
                return createLi9(context, parent, evaluator);
            case 33:
                return createLink6(context, parent, evaluator);
            case 32:
                return createEventHandler9(context, parent, evaluator);
            case 37:
                return createLi10(context, parent, evaluator);
            case 36:
                return createLink1(context, parent, evaluator);
            case 35:
                return createEventHandler10(context, parent, evaluator);
            case 40:
                return createLi11(context, parent, evaluator);
            case 39:
                return createLink11(context, parent, evaluator);
            case 38:
                return createEventHandler11(context, parent, evaluator);
            case 43:
                return createLi12(context, parent, evaluator);
            case 42:
                return createLink9(context, parent, evaluator);
            case 41:
                return createEventHandler12(context, parent, evaluator);
            case 385:
                return createToolbarcontents(context, parent, evaluator);
            case 83:
                return createDiv4(context, parent, evaluator);
            case 47:
                return createLinkdrefresh(context, parent, evaluator);
            case 46:
                return createEventHandler13(context, parent, evaluator);
            case 48:
                return createText3(context, parent, evaluator);
            case 50:
                return createLink24(context, parent, evaluator);
            case 49:
                return createEventHandler14(context, parent, evaluator);
            case 51:
                return createText4(context, parent, evaluator);
            case 53:
                return createLink20(context, parent, evaluator);
            case 52:
                return createEventHandler15(context, parent, evaluator);
            case 54:
                return createText5(context, parent, evaluator);
            case 56:
                return createLink33(context, parent, evaluator);
            case 55:
                return createEventHandler16(context, parent, evaluator);
            case 58:
                return createLink34(context, parent, evaluator);
            case 57:
                return createEventHandler17(context, parent, evaluator);
            case 59:
                return createText6(context, parent, evaluator);
            case 61:
                return createLink21(context, parent, evaluator);
            case 60:
                return createEventHandler18(context, parent, evaluator);
            case 81:
                return createDtmessages(context, parent, evaluator);
            case 64:
                return createTr(context, parent, evaluator);
            case 63:
                return createTd(context, parent, evaluator);
            case 62:
                return createText7(context, parent, evaluator);
            case 78:
                return createTr2(context, parent, evaluator);
            case 67:
                return createTd2(context, parent, evaluator);
            case 65:
                return createText8(context, parent, evaluator);
            case 66:
                return createText9(context, parent, evaluator);
            case 77:
                return createTd3(context, parent, evaluator);
            case 68:
                return createText10(context, parent, evaluator);
            case 69:
                return createText11(context, parent, evaluator);
            case 76:
                return createStacktrace(context, parent, evaluator);
            case 71:
                return createLink27(context, parent, evaluator);
            case 70:
                return createEventHandler19(context, parent, evaluator);
            case 73:
                return createLink29(context, parent, evaluator);
            case 72:
                return createEventHandler20(context, parent, evaluator);
            case 74:
                return createBr(context, parent, evaluator);
            case 75:
                return createText12(context, parent, evaluator);
            case 79:
                return createText13(context, parent, evaluator);
            case 80:
                return createText14(context, parent, evaluator);
            case 82:
                return createText15(context, parent, evaluator);
            case 116:
                return createDiv5(context, parent, evaluator);
            case 85:
                return createLink18(context, parent, evaluator);
            case 84:
                return createEventHandler21(context, parent, evaluator);
            case 92:
                return createSpan(context, parent, evaluator);
            case 86:
                return createText16(context, parent, evaluator);
            case 88:
                return createLink17(context, parent, evaluator);
            case 87:
                return createEventHandler22(context, parent, evaluator);
            case 89:
                return createText17(context, parent, evaluator);
            case 91:
                return createLink22(context, parent, evaluator);
            case 90:
                return createEventHandler23(context, parent, evaluator);
            case 93:
                return createText18(context, parent, evaluator);
            case 95:
                return createLink14(context, parent, evaluator);
            case 94:
                return createEventHandler24(context, parent, evaluator);
            case 97:
                return createLink16(context, parent, evaluator);
            case 96:
                return createEventHandler25(context, parent, evaluator);
            case 99:
                return createDiv6(context, parent, evaluator);
            case 98:
                return createText19(context, parent, evaluator);
            case 115:
                return createRepeatscope(context, parent, evaluator);
            case 112:
                return createTr3(context, parent, evaluator);
            case 109:
                return createTd4(context, parent, evaluator);
            case 107:
                return createDiv7(context, parent, evaluator);
            case 102:
                return createLink26(context, parent, evaluator);
            case 100:
                return createEventHandler26(context, parent, evaluator);
            case 101:
                return createImage2(context, parent, evaluator);
            case 103:
                return createText20(context, parent, evaluator);
            case 106:
                return createLink25(context, parent, evaluator);
            case 104:
                return createEventHandler27(context, parent, evaluator);
            case 105:
                return createImage1(context, parent, evaluator);
            case 108:
                return createText21(context, parent, evaluator);
            case 111:
                return createTd5(context, parent, evaluator);
            case 110:
                return createText22(context, parent, evaluator);
            case 113:
                return createText23(context, parent, evaluator);
            case 114:
                return createText24(context, parent, evaluator);
            case 144:
                return createLogfiles(context, parent, evaluator);
            case 136:
                return createDiv8(context, parent, evaluator);
            case 118:
                return createStrong(context, parent, evaluator);
            case 117:
                return createText25(context, parent, evaluator);
            case 119:
                return createText26(context, parent, evaluator);
            case 123:
                return createComboboxlogfile(context, parent, evaluator);
            case 120:
                return createSelectItem(context, parent, evaluator);
            case 121:
                return createSelectItems(context, parent, evaluator);
            case 122:
                return createEventHandler28(context, parent, evaluator);
            case 124:
                return createText27(context, parent, evaluator);
            case 126:
                return createLink37(context, parent, evaluator);
            case 125:
                return createEventHandler29(context, parent, evaluator);
            case 135:
                return createSpan2(context, parent, evaluator);
            case 128:
                return createStrong2(context, parent, evaluator);
            case 127:
                return createText28(context, parent, evaluator);
            case 129:
                return createText29(context, parent, evaluator);
            case 130:
                return createText30(context, parent, evaluator);
            case 134:
                return createRepeat1(context, parent, evaluator);
            case 132:
                return createLink41(context, parent, evaluator);
            case 131:
                return createEventHandler30(context, parent, evaluator);
            case 133:
                return createText31(context, parent, evaluator);
            case 143:
                return createLogfilecontents(context, parent, evaluator);
            case 141:
                return createDiv9(context, parent, evaluator);
            case 137:
                return createText32(context, parent, evaluator);
            case 139:
                return createLink40(context, parent, evaluator);
            case 138:
                return createEventHandler31(context, parent, evaluator);
            case 140:
                return createText33(context, parent, evaluator);
            case 142:
                return createText34(context, parent, evaluator);
            case 241:
                return createDiv10(context, parent, evaluator);
            case 201:
                return createDiv11(context, parent, evaluator);
            case 146:
                return createDiv12(context, parent, evaluator);
            case 145:
                return createText35(context, parent, evaluator);
            case 200:
                return createTable(context, parent, evaluator);
            case 199:
                return createTbody(context, parent, evaluator);
            case 149:
                return createTr4(context, parent, evaluator);
            case 148:
                return createTh(context, parent, evaluator);
            case 147:
                return createText36(context, parent, evaluator);
            case 155:
                return createRepeat3(context, parent, evaluator);
            case 154:
                return createTr5(context, parent, evaluator);
            case 151:
                return createTd6(context, parent, evaluator);
            case 150:
                return createText37(context, parent, evaluator);
            case 153:
                return createTd7(context, parent, evaluator);
            case 152:
                return createText38(context, parent, evaluator);
            case 158:
                return createTr6(context, parent, evaluator);
            case 157:
                return createTh2(context, parent, evaluator);
            case 156:
                return createText39(context, parent, evaluator);
            case 164:
                return createRepeat4(context, parent, evaluator);
            case 163:
                return createTr7(context, parent, evaluator);
            case 160:
                return createTd8(context, parent, evaluator);
            case 159:
                return createText40(context, parent, evaluator);
            case 162:
                return createTd9(context, parent, evaluator);
            case 161:
                return createText41(context, parent, evaluator);
            case 167:
                return createTr8(context, parent, evaluator);
            case 166:
                return createTh3(context, parent, evaluator);
            case 165:
                return createText42(context, parent, evaluator);
            case 173:
                return createRepeat6(context, parent, evaluator);
            case 172:
                return createTr9(context, parent, evaluator);
            case 169:
                return createTd10(context, parent, evaluator);
            case 168:
                return createText43(context, parent, evaluator);
            case 171:
                return createTd11(context, parent, evaluator);
            case 170:
                return createText44(context, parent, evaluator);
            case 176:
                return createTr10(context, parent, evaluator);
            case 175:
                return createTh4(context, parent, evaluator);
            case 174:
                return createText45(context, parent, evaluator);
            case 182:
                return createRepeat5(context, parent, evaluator);
            case 181:
                return createTr11(context, parent, evaluator);
            case 178:
                return createTd12(context, parent, evaluator);
            case 177:
                return createText46(context, parent, evaluator);
            case 180:
                return createTd13(context, parent, evaluator);
            case 179:
                return createText47(context, parent, evaluator);
            case 189:
                return createTr12(context, parent, evaluator);
            case 184:
                return createTd14(context, parent, evaluator);
            case 183:
                return createText48(context, parent, evaluator);
            case 188:
                return createTd15(context, parent, evaluator);
            case 186:
                return createLink38(context, parent, evaluator);
            case 185:
                return createEventHandler32(context, parent, evaluator);
            case 187:
                return createText49(context, parent, evaluator);
            case 192:
                return createTr13(context, parent, evaluator);
            case 191:
                return createTh5(context, parent, evaluator);
            case 190:
                return createText50(context, parent, evaluator);
            case 198:
                return createRepeat7(context, parent, evaluator);
            case 197:
                return createTr14(context, parent, evaluator);
            case 194:
                return createTd16(context, parent, evaluator);
            case 193:
                return createText51(context, parent, evaluator);
            case 196:
                return createTd17(context, parent, evaluator);
            case 195:
                return createText52(context, parent, evaluator);
            case 239:
                return createDiv13(context, parent, evaluator);
            case 203:
                return createDiv14(context, parent, evaluator);
            case 202:
                return createText53(context, parent, evaluator);
            case 222:
                return createTable2(context, parent, evaluator);
            case 221:
                return createTbody2(context, parent, evaluator);
            case 208:
                return createTr15(context, parent, evaluator);
            case 205:
                return createTd18(context, parent, evaluator);
            case 204:
                return createText54(context, parent, evaluator);
            case 207:
                return createTd19(context, parent, evaluator);
            case 206:
                return createComputedfield3(context, parent, evaluator);
            case 215:
                return createTr16(context, parent, evaluator);
            case 210:
                return createTd20(context, parent, evaluator);
            case 209:
                return createText55(context, parent, evaluator);
            case 214:
                return createTd21(context, parent, evaluator);
            case 211:
                return createComputedfield8(context, parent, evaluator);
            case 212:
                return createLink36(context, parent, evaluator);
            case 213:
                return createImage3(context, parent, evaluator);
            case 220:
                return createTr17(context, parent, evaluator);
            case 217:
                return createTd22(context, parent, evaluator);
            case 216:
                return createText56(context, parent, evaluator);
            case 219:
                return createTd23(context, parent, evaluator);
            case 218:
                return createText57(context, parent, evaluator);
            case 227:
                return createDiv15(context, parent, evaluator);
            case 223:
                return createText58(context, parent, evaluator);
            case 225:
                return createA2(context, parent, evaluator);
            case 224:
                return createText59(context, parent, evaluator);
            case 226:
                return createText60(context, parent, evaluator);
            case 238:
                return createJava(context, parent, evaluator);
            case 229:
                return createDiv16(context, parent, evaluator);
            case 228:
                return createText61(context, parent, evaluator);
            case 230:
                return createText62(context, parent, evaluator);
            case 234:
                return createDiv17(context, parent, evaluator);
            case 233:
                return createTable3(context, parent, evaluator);
            case 232:
                return createTbody3(context, parent, evaluator);
            case 231:
                return createText63(context, parent, evaluator);
            case 237:
                return createDiv18(context, parent, evaluator);
            case 236:
                return createLink28(context, parent, evaluator);
            case 235:
                return createEventHandler33(context, parent, evaluator);
            case 240:
                return createBr2(context, parent, evaluator);
            case 343:
                return createInspector(context, parent, evaluator);
            case 287:
                return createInspectorheader(context, parent, evaluator);
            case 272:
                return createTr18(context, parent, evaluator);
            case 251:
                return createTd24(context, parent, evaluator);
            case 243:
                return createStrong3(context, parent, evaluator);
            case 242:
                return createText64(context, parent, evaluator);
            case 244:
                return createBr3(context, parent, evaluator);
            case 245:
                return createText65(context, parent, evaluator);
            case 247:
                return createLink15(context, parent, evaluator);
            case 246:
                return createEventHandler34(context, parent, evaluator);
            case 249:
                return createLink30(context, parent, evaluator);
            case 248:
                return createEventHandler35(context, parent, evaluator);
            case 250:
                return createText66(context, parent, evaluator);
            case 263:
                return createTd25(context, parent, evaluator);
            case 255:
                return createComponentid(context, parent, evaluator);
            case 252:
                return createSelectItem2(context, parent, evaluator);
            case 253:
                return createSelectItems2(context, parent, evaluator);
            case 254:
                return createEventHandler36(context, parent, evaluator);
            case 256:
                return createText67(context, parent, evaluator);
            case 258:
                return createChkshowhiddencontrols(context, parent, evaluator);
            case 257:
                return createEventHandler37(context, parent, evaluator);
            case 259:
                return createBr4(context, parent, evaluator);
            case 262:
                return createRepeat2(context, parent, evaluator);
            case 261:
                return createLink19(context, parent, evaluator);
            case 260:
                return createEventHandler38(context, parent, evaluator);
            case 266:
                return createTd26(context, parent, evaluator);
            case 265:
                return createStrong4(context, parent, evaluator);
            case 264:
                return createText68(context, parent, evaluator);
            case 271:
                return createTd27(context, parent, evaluator);
            case 270:
                return createCbprevexp(context, parent, evaluator);
            case 267:
                return createSelectItem3(context, parent, evaluator);
            case 268:
                return createSelectItems3(context, parent, evaluator);
            case 269:
                return createEventHandler39(context, parent, evaluator);
            case 273:
                return createTr19(context, parent, evaluator);
            case 286:
                return createTr20(context, parent, evaluator);
            case 276:
                return createTd28(context, parent, evaluator);
            case 275:
                return createStrong5(context, parent, evaluator);
            case 274:
                return createText69(context, parent, evaluator);
            case 285:
                return createTd29(context, parent, evaluator);
            case 278:
                return createInputexpression(context, parent, evaluator);
            case 277:
                return createEventHandler40(context, parent, evaluator);
            case 279:
                return createText70(context, parent, evaluator);
            case 281:
                return createLink31(context, parent, evaluator);
            case 280:
                return createEventHandler41(context, parent, evaluator);
            case 282:
                return createBr5(context, parent, evaluator);
            case 284:
                return createI(context, parent, evaluator);
            case 283:
                return createText71(context, parent, evaluator);
            case 289:
                return createDiv19(context, parent, evaluator);
            case 288:
                return createText72(context, parent, evaluator);
            case 291:
                return createDiv20(context, parent, evaluator);
            case 290:
                return createText73(context, parent, evaluator);
            case 293:
                return createPre(context, parent, evaluator);
            case 292:
                return createInspectormessages(context, parent, evaluator);
            case 342:
                return createExpressioninfo(context, parent, evaluator);
            case 298:
                return createDiv21(context, parent, evaluator);
            case 295:
                return createB(context, parent, evaluator);
            case 294:
                return createLink44(context, parent, evaluator);
            case 296:
                return createBr6(context, parent, evaluator);
            case 297:
                return createExpressionvalue(context, parent, evaluator);
            case 307:
                return createDiv22(context, parent, evaluator);
            case 300:
                return createLink35(context, parent, evaluator);
            case 299:
                return createEventHandler42(context, parent, evaluator);
            case 302:
                return createLink32(context, parent, evaluator);
            case 301:
                return createEventHandler43(context, parent, evaluator);
            case 306:
                return createSpan3(context, parent, evaluator);
            case 303:
                return createText74(context, parent, evaluator);
            case 305:
                return createLink10(context, parent, evaluator);
            case 304:
                return createEventHandler44(context, parent, evaluator);
            case 341:
                return createTable4(context, parent, evaluator);
            case 327:
                return createRepeatmethods(context, parent, evaluator);
            case 325:
                return createTr21(context, parent, evaluator);
            case 310:
                return createTd30(context, parent, evaluator);
            case 308:
                return createLink7(context, parent, evaluator);
            case 309:
                return createComputedfield4(context, parent, evaluator);
            case 321:
                return createTd31(context, parent, evaluator);
            case 313:
                return createStrong6(context, parent, evaluator);
            case 312:
                return createLink42(context, parent, evaluator);
            case 311:
                return createEventHandler45(context, parent, evaluator);
            case 314:
                return createText75(context, parent, evaluator);
            case 317:
                return createRepeatpm(context, parent, evaluator);
            case 315:
                return createLink43(context, parent, evaluator);
            case 316:
                return createText76(context, parent, evaluator);
            case 318:
                return createText77(context, parent, evaluator);
            case 319:
                return createBr7(context, parent, evaluator);
            case 320:
                return createText78(context, parent, evaluator);
            case 324:
                return createTd32(context, parent, evaluator);
            case 322:
                return createText79(context, parent, evaluator);
            case 323:
                return createLinkdeclclass(context, parent, evaluator);
            case 326:
                return createText80(context, parent, evaluator);
            case 340:
                return createRepeatfields(context, parent, evaluator);
            case 338:
                return createTr22(context, parent, evaluator);
            case 330:
                return createTd33(context, parent, evaluator);
            case 328:
                return createLink45(context, parent, evaluator);
            case 329:
                return createComputedfield5(context, parent, evaluator);
            case 334:
                return createTd34(context, parent, evaluator);
            case 333:
                return createStrong7(context, parent, evaluator);
            case 332:
                return createLink46(context, parent, evaluator);
            case 331:
                return createEventHandler46(context, parent, evaluator);
            case 337:
                return createTd35(context, parent, evaluator);
            case 335:
                return createLink(context, parent, evaluator);
            case 336:
                return createText81(context, parent, evaluator);
            case 339:
                return createText82(context, parent, evaluator);
            case 384:
                return createDiv23(context, parent, evaluator);
            case 383:
                return createDiv24(context, parent, evaluator);
            case 378:
                return createDiv25(context, parent, evaluator);
            case 377:
                return createTable5(context, parent, evaluator);
            case 376:
                return createTbody4(context, parent, evaluator);
            case 365:
                return createTr23(context, parent, evaluator);
            case 345:
                return createTd36(context, parent, evaluator);
            case 344:
                return createImg(context, parent, evaluator);
            case 364:
                return createTd37(context, parent, evaluator);
            case 346:
                return createText83(context, parent, evaluator);
            case 347:
                return createLink47(context, parent, evaluator);
            case 348:
                return createText84(context, parent, evaluator);
            case 349:
                return createLink48(context, parent, evaluator);
            case 350:
                return createText85(context, parent, evaluator);
            case 352:
                return createA3(context, parent, evaluator);
            case 351:
                return createText86(context, parent, evaluator);
            case 353:
                return createText87(context, parent, evaluator);
            case 354:
                return createBr8(context, parent, evaluator);
            case 355:
                return createBr9(context, parent, evaluator);
            case 357:
                return createA4(context, parent, evaluator);
            case 356:
                return createText88(context, parent, evaluator);
            case 358:
                return createText89(context, parent, evaluator);
            case 360:
                return createA5(context, parent, evaluator);
            case 359:
                return createText90(context, parent, evaluator);
            case 361:
                return createText91(context, parent, evaluator);
            case 363:
                return createA6(context, parent, evaluator);
            case 362:
                return createText92(context, parent, evaluator);
            case 375:
                return createTr24(context, parent, evaluator);
            case 374:
                return createTd38(context, parent, evaluator);
            case 366:
                return createText93(context, parent, evaluator);
            case 367:
                return createBr10(context, parent, evaluator);
            case 368:
                return createBr11(context, parent, evaluator);
            case 369:
                return createText94(context, parent, evaluator);
            case 371:
                return createA7(context, parent, evaluator);
            case 370:
                return createText95(context, parent, evaluator);
            case 372:
                return createText96(context, parent, evaluator);
            case 373:
                return createBr12(context, parent, evaluator);
            case 382:
                return createP(context, parent, evaluator);
            case 379:
                return createText97(context, parent, evaluator);
            case 380:
                return createLink13(context, parent, evaluator);
            case 381:
                return createText98(context, parent, evaluator);
            case 392:
                return createDiv26(context, parent, evaluator);
            case 391:
                return createUl4(context, parent, evaluator);
            case 387:
                return createLi13(context, parent, evaluator);
            case 386:
                return createLink39(context, parent, evaluator);
            case 390:
                return createLi14(context, parent, evaluator);
            case 389:
                return createLink4(context, parent, evaluator);
            case 388:
                return createEventHandler47(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        protected void initIncluderAsRoot(FacesContext context,
                PageExpressionEvaluator evaluator, UIComponent root) {
            String sourceId = "/xp:view[1]/xp:this.beforePageLoad[1]/text()";
            MethodBinding beforePageLoad = evaluator.createMethodBinding(root,
                    "#{javascript:if (typeof dBar != \"undefined\") {\n\tdBar.init(compositeData.defaultCollapsed, compositeData.toolbarColor);\n}}",
                    null,null, sourceId);
            FacesPageProvider asPageProvider = root instanceof FacesPageProvider ?
                    (FacesPageProvider) root : null;
            if( null != asPageProvider ){
                asPageProvider.setBeforePageLoad(beforePageLoad);
            }
           
            String sourceId2 = "/xp:view[1]/xp:this.beforeRenderResponse[1]/text()";
            MethodBinding beforeRenderResponse = evaluator.createMethodBinding(root,
                    "#{javascript:if( typeof dBar != \"undefined\" && dBar.getActiveTab().equals(\"inspector\") ) {\n\tdBar.executeInspector();\n}}",
                    null,null, sourceId2);
            if( null != asPageProvider ){
                asPageProvider.setBeforeRenderResponse(beforeRenderResponse);
            }
            if( null != asPageProvider ){
                asPageProvider.setDojoTheme(true);
            }
        }

        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            String sourceId = "/xp:view[1]/xp:this.beforePageLoad[1]/text()";
            MethodBinding beforePageLoad = evaluator.createMethodBinding(result,
                    "#{javascript:if (typeof dBar != \"undefined\") {\n\tdBar.init(compositeData.defaultCollapsed, compositeData.toolbarColor);\n}}",
                    null,null, sourceId);
            result.setBeforePageLoad(beforePageLoad);
            ScriptResource resources = new ScriptResource();
            resources.setComponent(result);
            resources.setClientSide(false);
            resources.setSrc("/xpDebugToolbar.jss");
            result.addResource(resources);
            String sourceId2 = "/xp:view[1]/xp:this.beforeRenderResponse[1]/text()";
            MethodBinding beforeRenderResponse = evaluator.createMethodBinding(result,
                    "#{javascript:if( typeof dBar != \"undefined\" && dBar.getActiveTab().equals(\"inspector\") ) {\n\tdBar.executeInspector();\n}}",
                    null,null, sourceId2);
            result.setBeforeRenderResponse(beforeRenderResponse);
            result.setDojoTheme(true);
            return result;
        }

        private UIComponent createPanel(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            result.setStyle("visibility:visible;");
            String sourceId = "/xp:view[1]/xp:panel[1]/@rendered";
            String renderedExpr = "#{dBar.toolbarVisible}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createA(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("a");
            component.addAttribute("name", "dBar");
            return component;
        }

        private UIComponent createStyle(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("style");
            component.addAttribute("type", "text/css");
            return component;
        }

        private UIComponent createText(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = "div.dBar {\n\t\t\t\tfont: normal 11px/normal Arial,\u200bHelvetica,\u200bsans-serif;\n\t\t\t\tposition: absolute;\n\t\t\t\tz-index: 10000;\n\t\t\t\tcolor: #000000;\n\t\t\t\ttop: 0;\n\t\t\t\tleft: 0;\n\t\t\t\ttext-shadow: none;\t\n-moz-box-shadow: 0 0 4px rgba(0,0,0,0.6);\n-webkit-box-shadow: 0 0 4px rgba(0,0,0,0.6);\nbox-shadow: 0 0 4px rgba(0,0,0,0.6);\n\t\t\t}\n\t\t\t\n\t\t\tdiv.dBar.expanded {\n\t\t\t\twidth: 100%;\n\t\t\t}\n\t\t\tdiv.dBar.collapsed {\n\t\t\t\t\n\t\t\t}\n\t\t\t\n\t\t\tdiv.dBar select, div.dBar input, div.dBar button, div.dBar label, div.dBar li {\n\t\t\t\tfont: normal 11px/normal Arial,\u200bHelvetica,\u200bsans-serif;\n\t\t\t}\n\t\t\tdiv.dBar a, div.dBar a:visited { \n\t\t\t\ttext-decoration: none; color: #0F04DB;\n\t\t\t}\n\t\t\tdiv.dBar a:hover, div.dBar a:active { \n\t\t\t\ttext-decoration: underline;\n\t\t\t}\n\t\t\tdiv.dBar tr { vertical-align: top !important; }\n\t\t\t\n\t\t\tdiv.dBar .dBarMsg { padding: 4px; background: #FFF34F; border: 2px solid black; margin-bottom: 10px; }\n\n\t\t\tdiv.dBar .showToolbar { position: absolute; left: 0;\n\t\t\t} \n\t\t\tdiv.dBar .toolbar { width: 100%; }\n\t\t\tdiv.dBar .hideContent { padding-left: 5px; } \n\t\t\tdiv.dBar .highlight { background: #FCFFB5;\n\t\t\tfont-style: italic; }\n\n\t\t\tdiv.dBar ul.links { display: block; list-style: none\n\t\t\toutside none; margin: 0; padding: 0; } div.dBar\n\t\t\tul.links li { display: inline-block; line-height: 21px;\n\t\t\tpadding: 0; position: relative; vertical-align: top;\n\t\t\tmargin-right: 2px;\n\n\t\t\t} div.dBar ul.links a { color: #ffffff; font-weight: normal; border-left: 1px solid transparent; border-right: 1px\n\t\t\tsolid transparent; display: block; padding: 0 5px; position:\n\t\t\trelative; }\n\t\t\t\n\t\t\tdiv.dBar.collapsed\n\t\t\tul.links li { \n\t\t\tmargin-right: 0;\n\t\t\t}\n\t\t\t\n\t\t\t\n\t\t\tdiv.dBar ul.links a:hover, div.dBar ul.links a.selected { background: #9B9B9B; text-decoration: none; }\n\t\t\tdiv.dBar .contentWrapper { background: #9B9B9B; color: #000000; padding: 3px; }\n\t\t\tdiv.dBar .contentWrapper td { padding: 2px 2px 2px 0; }\n\t\t\tdiv.dBar .content { margin: 0; padding: 5px 9px 9px 9px; background: #ffffff; }\n\n\t\t\tdiv.dBar table.grid { border-collapse: collapse; }\n\t\t\tdiv.dBar table.grid th { background: #B7B7B7;\n\t\t\tpadding: 2px; text-align: left !important; font-weight:bold\n\t\t\t!important; } div.dBar table.grid > tbody > tr > td, div.dBar table.grid th\n\t\t\t{ border: 1px solid #B7B7B7; padding: 2px 5px; }\n\n\t\t\tdiv.dBar td.label div.clear {float:right; width:\n\t\t\t30px;}\n\n\t\t\tdiv.dBar table.grid td.small { width: 50px;\n\t\t\twhite-space: nowrap } \n\t\t\tdiv.dBar table.grid td.label {\n\t\t\t\tbackground: #eeeeee; font-weight: bold; \n\t\t\t\tfont-size: inherit; \n\t\t\t\tcolor: inherit; \n\t\t\t\ttext-transform: inherit; \n\t\t\t\twidth: 150px;\n\t\t\t\ttext-shadow: inherit;\n\t\t\t}\n\t\t\tdiv.dBar table.grid td.wide {\n\t\t\t\twidth: 270px;\n\t\t\t}\n\t\t\t\n\t\t\tdiv.dBar input.expression {\n\t\t\t\twidth:550px;\n\t\t\t\tmargin-bottom:3px;\n\t\t\t}\n\t\t\t\n\t\t\tdiv.dBar table.grid th { background: #cccccc;\n\t\t\tfont-weight: bold; padding-top: 5px; text-transform:\n\t\t\tuppercase }\n\n\t\t\tdiv.dBar table.messages { border-collapse: collapse; }\n\t\t\tdiv.dBar table.messages tr.divider {background:\n\t\t\tblack; } div.dBar table.messages td { padding:2px; }\n\t\t\tdiv.dBar table.messages tr.divider td {padding: 0\n\t\t\t!important; line-height: 2px;} div.dBar\n\t\t\ttable.messages td.time { width: 50px; white-space: nowrap;\n\t\t\tpadding-right: 5px; }\n\t\t\tdiv.dBar table.striped tbody tr:nth-child(even) {\n\t\t\t\tbackground: #EEEEEE;\n\t\t\t}\n\t\t\tdiv.dBar .className {\n\t\t\t\tpadding: 4px;\n\t\t\t\tmargin: 7px 0;\n\t\t\t\tfont-size: 16px;\n\t\t\t\tbackground: #eeeeee;\n\t\t\t}\n\t\t\tdiv.dBar ul {\n\t\t\t\tlist-style-type:none;\n\t\t\t}\n\t\t\t\n\t\t\tdiv.dBar table.errorDetails td {padding: 1px 3px 1px 0; }\n\n\t\t\tdiv.dBar .error { color: red; } div.dBar\n\t\t\t.warning { color: #CCA600; } div.dBar .debug {\n\t\t\tfont-style: italic; }\n\t\t\t\n\t\t\tdiv.dBar table.dumped { margin:0;\n\t\t\tpadding:0; border:0; border-collapse:collapse; }\n\t\t\tdiv.dBar table.dumped td { border-top: 1px solid\n\t\t\t#CECECE; padding:1px 6px 1px 1px; margin:0;}\n\t\t\tdiv.dBar table.dumped td.first { border-top: 0;}\n\t\t\tdiv.dBar img { vertical-align:middle; margin: 0;}\t\t\t\n\t\t\tdiv.dBar img.faded { -khtml-opacity:.40; -moz-opacity:.40;\n\t\t\t-ms-filter:\"alpha(opacity=40)\"; filter:alpha(opacity=40);\n\t\t\topacity:.40; }\n\n\t\t\tdiv.dBar img.faded:hover { -khtml-opacity:.90;\n\t\t\t-moz-opacity:.90; -ms-filter:\"alpha(opacity=90)\";\n\t\t\tfilter:alpha(opacity=90); opacity:.90; }\n\n\t\t\ttable.inspect td.returns {\n\t\t\t\ttext-align:right;\n\t\t\t\tfont-size: 10px;\n\t\t\t}\n\t\t\ttable.inspect td.inherits {\n\t\t\t\tfont-size: 10px;\n\t\t\t}\n\t\t\t\n\t\t\tdiv.dBar .aboutMe {\n\t\t\t\tmargin: 15px 15px 30px 15px; \n\t\t\t\tpadding: 15px; \n\t\t\t\twidth: 450px; \n\t\t\t\tcolor: #fff;\n\t\t\t\tbackground: #161E7A;\n\t\t\t}\n\t\t\tdiv.dBar .aboutMe a, div.dBar .aboutMe a:visited {\n\t\t\t\tcolor: #fff;\n\t\t\t\ttext-decoration: underline;\n\t\t\t}\n\t\t\tdiv.dBar .aboutMe td {\n\t\t\t\tvertical-align: middle;\n\t\t\t}\n\t\t\tdiv.dBar .aboutMe img {\n\t\t\t\tpadding: 2px;\n\t\t\t\tborder: 2px solid #ffffff;\n\t\t\t\tmargin-right: 7px;\n\t\t\t}\n\t\t\t\n\t\t\tdiv.dBar .xspMessage { cursor: pointer; height: 1em;\n\t\t\toverflow: hidden; }\n\t\t\tdiv.dBar .xspMessage:active {\n\t\t\theight: auto; }\n\t\t\tdiv.dBar li {\n\t\t\t\tpadding: 0;\n\t\t\t}\n\t\t\t\n\t\t\t/*reset bootstrap styles*/\n\t\t\tdiv.dBar label { display: inline; margin:0; }\n\t\t\tdiv.dBar select {\n\t\t\t\tpadding: 0;\n\t\t\t}";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createText2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "/xp:view[1]/xp:panel[1]/xp:text[1]/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:\"<style type=\\\"text/css\\\">div.dBar.bg { background: \" + dBar.color + \"; color: #ffffff;}</style>\"}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createDebugtoolbar(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "debugToolbar/xp:this.style[1]/text()";
            String styleExpr = "#{javascript:(dBar.isCollapsed() ? (compositeData.collapseTo == \"right\" ? \"right: 0;\" : \"left: 0;\") : \"\")}";
            ValueBinding style = evaluator.createValueBinding(result, styleExpr, sourceId,String.class);
            result.setValueBinding("style", style);
            String sourceId2 = "debugToolbar/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:\"dBar bg \" + (dBar.isCollapsed() ? \"collapsed\" : \"expanded\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId2,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "debugToolbar");
            return result;
        }

        private UIComponent createDiv(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "debugToolbar/xp:div[1]/@rendered";
            String renderedExpr = "#{dBar.collapsed}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createUl(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("ul");
            component.addAttribute("class", "links");
            return component;
        }

        private UIComponent createLi(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(false);
            result.setTitle("expand the debug toolbar");
            setId(result, "link8");
            String sourceId = "link8/xp:this.text[1]/text()";
            String textExpr = "#{javascript:var messageText = (dBar.getNumMessages() == 0 ? \"\" : \" (\" + dBar.getNumMessages() + \"/\" + dBar.getNumErrors() + \")\");\n\n(compositeData.collapseTo == \"right\" ? \"<< \" + messageText : messageText + \" >>\")}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link8/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setCollapsed(false)}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createDiv2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "debugToolbar/xp:div[2]/@rendered";
            String renderedExpr = "#{!dBar.collapsed}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createDiv3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "float:right");
            return component;
        }

        private UIComponent createUl2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("ul");
            component.addAttribute("class", "links");
            return component;
        }

        private UIComponent createLi2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(false);
            String sourceId = "link12/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:(dBar.getActiveTab().equals(\"about\") ? \"selected\" : \"\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "link12");
            result.setText("about");
            return result;
        }

        private UIComponent createEventHandler2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link12/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setActiveTab(\"about\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLi3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink23(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(false);
            result.setTitle("remove the toolbar for the current session");
            setId(result, "link23");
            result.setText("remove");
            return result;
        }

        private UIComponent createEventHandler3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link23/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setToolbarVisible(false);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createUl3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("ul");
            component.addAttribute("class", "links");
            return component;
        }

        private UIComponent createLi4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLinkcollapse(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(false);
            result.setTitle("collapse the debug toolbar");
            setId(result, "linkCollapse");
            String sourceId = "linkCollapse/xp:this.text[1]/text()";
            String textExpr = "#{javascript:(compositeData.collapseTo == \"right\" ? \">>\" : \"<<\")}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "linkCollapse/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setCollapsed(true);\n\t\t\t\t\t\t\t\tdBar.setActiveTab(\"\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLi5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLinktabmessages(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(false);
            String sourceId = "linkTabMessages/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:(\"messages\".equals( dBar.getActiveTab() ) ? \"selected\" : \"\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "linkTabMessages");
            String sourceId2 = "linkTabMessages/xp:this.text[1]/text()";
            String textExpr = "#{javascript:\"messages (\" + dBar.getNumMessages() + \"/\" + dBar.getNumErrors() + \")\";\n}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId2,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "linkTabMessages/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setActiveTab(\"messages\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLi6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link3/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:(\"applicationScope\".equals( dBar.getActiveTab() ) ? \"selected\" : \"\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "link3");
            result.setText("applicationScope");
            return result;
        }

        private UIComponent createEventHandler6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link3/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setActiveTab(\"applicationScope\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLi7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link2/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:(\"sessionScope\".equals( dBar.getActiveTab() ) ? \"selected\" : \"\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "link2");
            result.setText("sessionScope");
            return result;
        }

        private UIComponent createEventHandler7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link2/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setActiveTab(\"sessionScope\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLi8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link5/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:(\"viewScope\".equals( dBar.getActiveTab() ) ? \"selected\" : \"\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "link5");
            result.setText("viewScope");
            return result;
        }

        private UIComponent createEventHandler8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link5/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setActiveTab(\"viewScope\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLi9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link6/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:(\"requestScope\".equals( dBar.getActiveTab() ) ? \"selected\" : \"\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "link6");
            result.setText("requestScope");
            return result;
        }

        private UIComponent createEventHandler9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link6/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setActiveTab(\"requestScope\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLi10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link1/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:(\"logs\".equals( dBar.getActiveTab() ) ? \"selected\" : \"\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "link1");
            result.setText("files");
            return result;
        }

        private UIComponent createEventHandler10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link1/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setActiveTab(\"logs\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLi11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link11/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:( dBar.getActiveTab().equals(\"customVars\") ? \"selected\" : \"\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "link11");
            result.setText("environment & Java");
            return result;
        }

        private UIComponent createEventHandler11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link11/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setActiveTab(\"customVars\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLi12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link9/xp:this.styleClass[1]/text()";
            String styleClassExpr = "#{javascript:( dBar.getActiveTab().equals(\"inspector\") ? \"selected\" : \"\")}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId,String.class);
            result.setValueBinding("styleClass", styleClass);
            setId(result, "link9");
            result.setText("inspector");
            return result;
        }

        private UIComponent createEventHandler12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link9/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setActiveTab(\"inspector\");\n\t\t\t\t\t\t\t\t}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createToolbarcontents(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "toolbarContents/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dBar.getActiveTab().length>0 && !dBar.isCollapsed()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("contentWrapper");
            setId(result, "toolbarContents");
            return result;
        }

        private UIComponent createDiv4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "toolbarContents/xp:div[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:\"messages\".equals( dBar.getActiveTab() )}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("content");
            return result;
        }

        private UIComponent createLinkdrefresh(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "linkDRefresh");
            result.setText("refresh");
            return result;
        }

        private UIComponent createEventHandler13(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createLink24(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link24");
            result.setText("add divider");
            return result;
        }

        private UIComponent createEventHandler14(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link24/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.addDivider();}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createLink20(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link20");
            result.setText("clear messages");
            return result;
        }

        private UIComponent createEventHandler15(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link20/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.clearMessages();}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createLink33(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(false);
            String sourceId = "link33/@rendered";
            String renderedExpr = "#{!dBar.detailedTimings}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link33");
            result.setText("show milliseconds");
            return result;
        }

        private UIComponent createEventHandler16(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link33/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setDetailedTimings(true);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLink34(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(false);
            String sourceId = "link34/@rendered";
            String renderedExpr = "#{dBar.detailedTimings}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link34");
            result.setText("hide milliseconds");
            return result;
        }

        private UIComponent createEventHandler17(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link34/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setDetailedTimings(false);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createLink21(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(false);
            setId(result, "link21");
            result.setText("open in external window");
            return result;
        }

        private UIComponent createEventHandler18(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link21/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.close();}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            String sourceId2 = "link21/xp:eventHandler[1]/xp:this.script[1]/text()";
            MethodBinding script = evaluator.createMethodBinding(result,
                    "var url = \"#{javascript:dBar.getConsolePath()}\"; \n\t\t\t\t\t\t\t\twindow.open(url,\'logMessages\',\n\t\'width=600,height=500,scrollbars=yes,resizable,toolbar=yes,location=yes,top=20,left=20\')",
                    null,null, sourceId2);
            result.setScript(script);
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createDtmessages(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "dtMessages/@value";
            String valueExpr = "#{dBar.messages}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setVar("dMessage");
            result.setRows(10000);
            setId(result, "dtMessages");
            return result;
        }

        private UIComponent createTr(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            String sourceId = "dtMessages/xp:tr[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dMessage.type == \"divider\"}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("divider");
            return result;
        }

        private UIComponent createTd(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            result.setColspan(2);
            return result;
        }

        private UIComponent createText7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0");
            return textComp;
        }

        private UIComponent createTr2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            String sourceId = "dtMessages/xp:tr[2]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dMessage.type != \"divider\"}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createTd2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            result.setStyleClass("time");
            return result;
        }

        private UIComponent createText8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            DateTimeConverter converter = new DateTimeConverter();
            converter.setPattern("HH:mm:ss");
            converter.setType("time");
            result.setConverter(converter);
            String sourceId = "dtMessages/xp:tr[2]/xp:td[1]/xp:text[1]/@value";
            String valueExpr = "#{dMessage.date}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId2 = "dtMessages/xp:tr[2]/xp:td[1]/xp:text[1]/@rendered";
            String renderedExpr = "#{!dBar.detailedTimings}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createText9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            DateTimeConverter converter = new DateTimeConverter();
            converter.setPattern("HH:mm:ss:SSS");
            converter.setType("time");
            result.setConverter(converter);
            String sourceId = "dtMessages/xp:tr[2]/xp:td[1]/xp:text[2]/@value";
            String valueExpr = "#{dMessage.date}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId2 = "dtMessages/xp:tr[2]/xp:td[1]/xp:text[2]/@rendered";
            String renderedExpr = "#{dBar.detailedTimings}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createTd3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createText10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "dtMessages/xp:tr[2]/xp:td[2]/xp:text[1]/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:(dMessage.context != null ? \"(\" + dMessage.context + \") \" : \"\")}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId2 = "dtMessages/xp:tr[2]/xp:td[2]/xp:text[1]/@styleClass";
            String styleClassExpr = "#{dMessage.styleclass}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId2,String.class);
            result.setValueBinding("styleClass", styleClass);
            return result;
        }

        private UIComponent createText11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "dtMessages/xp:tr[2]/xp:td[2]/xp:text[2]/@value";
            String valueExpr = "#{dMessage.text}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId2 = "dtMessages/xp:tr[2]/xp:td[2]/xp:text[2]/@styleClass";
            String styleClassExpr = "#{dMessage.styleclass}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId2,String.class);
            result.setValueBinding("styleClass", styleClass);
            return result;
        }

        private UIComponent createStacktrace(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "stackTrace/@rendered";
            String renderedExpr = "#{javascript:dMessage.hasStackTrace()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "stackTrace");
            return result;
        }

        private UIComponent createLink27(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link27/@rendered";
            String renderedExpr = "#{!dMessage.showStackTrace}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link27");
            result.setText("show stacktrace");
            return result;
        }

        private UIComponent createEventHandler19(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link27/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dMessage.setShowStackTrace(true);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("stackTrace");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLink29(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link29/@rendered";
            String renderedExpr = "#{dMessage.showStackTrace}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link29");
            result.setText("hide stacktrace");
            return result;
        }

        private UIComponent createEventHandler20(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link29/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dMessage.setShowStackTrace(false);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("stackTrace");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createBr(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createText12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            ConverterMethodBinding converter = new ConverterMethodBinding();
            String sourceId = "stackTrace/xp:text[1]/xp:this.converter[1]/xp:customConverter[1]/xp:this.getAsObject[1]/text()";
            MethodBinding getAsObject = evaluator.createMethodBinding(result,
                    "#{javascript:return value}",
                    new String[]{ "context", "component", "value" },
                    new Class[]{FacesContext.class, UIComponent.class, String.class}, sourceId);
            converter.setGetAsObject(getAsObject);
            String sourceId2 = "stackTrace/xp:text[1]/xp:this.converter[1]/xp:customConverter[1]/xp:this.getAsString[1]/text()";
            MethodBinding getAsString = evaluator.createMethodBinding(result,
                    "#{javascript:return @Implode(value, \"<br />\")}",
                    new String[]{ "context", "component", "value" },
                    new Class[]{FacesContext.class, UIComponent.class, Object.class}, sourceId2);
            converter.setGetAsString(getAsString);
            result.setConverter(converter);
            String sourceId3 = "stackTrace/xp:text[1]/@value";
            String valueExpr = "#{dMessage.stackTrace}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId3,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId4 = "stackTrace/xp:text[1]/@rendered";
            String renderedExpr = "#{dMessage.showStackTrace}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId4,boolean.class);
            result.setValueBinding("rendered", rendered);
            String sourceId5 = "stackTrace/xp:text[1]/@styleClass";
            String styleClassExpr = "#{dMessage.styleclass}";
            ValueBinding styleClass = evaluator.createValueBinding(result, styleClassExpr, sourceId5,String.class);
            result.setValueBinding("styleClass", styleClass);
            return result;
        }

        private UIComponent createText13(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("</tbody></table>");
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createText14(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String value = "<table class=\"messages striped\" style=\"width:100%; margin-top: 5px\"><tbody>";
            result.setValue(value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createText15(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("No messages found");
            result.setStyle("margin-top: 5px;");
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId = "toolbarContents/xp:div[1]/xp:text[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:getComponent(\"dtMessages\").getRowCount() ==0}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createDiv5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "toolbarContents/xp:div[2]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:@Contains( dBar.getActiveTab(), \"Scope\") }";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("content");
            return result;
        }

        private UIComponent createLink18(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link18");
            result.setText("refresh");
            return result;
        }

        private UIComponent createEventHandler21(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link18/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.readScopeKeys();}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createSpan(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspSpan result = new XspSpan();
            String sourceId = "toolbarContents/xp:div[2]/xp:span[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:(dBar.getActiveTab().equals(\"applicationScope\") || dBar.getActiveTab().equals(\"sessionScope\") ) && dBar.scopeHasValues()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createText16(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createLink17(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link17");
            String sourceId = "link17/xp:this.text[1]/text()";
            String textExpr = "#{javascript:\"clear \" + dBar.getActiveTab() }";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler22(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link17/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.clearScopeContents( dBar.getActiveTab());}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText17(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createLink22(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link22");
            result.setText("clear application- and sessionScope");
            return result;
        }

        private UIComponent createEventHandler23(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link22/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.clearScopeContents(\"both\");}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText18(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createLink14(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link14/@rendered";
            String renderedExpr = "#{dBar.showLists}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link14");
            result.setText("hide lists");
            return result;
        }

        private UIComponent createEventHandler24(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link14/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setShowLists(false);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLink16(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link16/@rendered";
            String renderedExpr = "#{!dBar.showLists}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link16");
            result.setText("show lists");
            return result;
        }

        private UIComponent createEventHandler25(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link16/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setShowLists(true);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createDiv6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            result.setStyle("margin-top: 5px;");
            String sourceId = "toolbarContents/xp:div[2]/xp:div[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:!dBar.scopeHasValues()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createText19(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("No values found");
            return textComp;
        }

        private UIComponent createRepeatscope(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeatScope/@value";
            String valueExpr = "#{dBar.scopeKeys}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("margin-top: 5px;");
            String sourceId2 = "repeatScope/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dBar.scopeHasValues()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setVar("scopeEntry");
            result.setRows(10000);
            setId(result, "repeatScope");
            return result;
        }

        private UIComponent createTr3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label wide");
            return component;
        }

        private UIComponent createDiv7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("class", "clear");
            return component;
        }

        private UIComponent createLink26(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link26/xp:this.title[1]/text()";
            String titleExpr = "#{javascript:\"Inspect \" + scopeEntry}";
            ValueBinding title = evaluator.createValueBinding(result, titleExpr, sourceId,String.class);
            result.setValueBinding("title", title);
            setId(result, "link26");
            String sourceId2 = "link26/xp:this.text[1]/text()";
            String textExpr = "#{javascript:( @ClientType().equals(\"Notes\") ? \"i\" : \"\");}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId2,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler26(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link26/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setInspectorExpression( dBar.getActiveTab() + \".get(\\\"\" + scopeEntry + \"\\\")\");\n\t\t\t\t\t\t\t\t\t\t\tdBar.setActiveTab(\"inspector\");\n\t\t\t\t\t\t\t\t\t\t}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createImage2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspGraphicImage result = new XspGraphicImage();
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId = "image2/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:!@ClientType().equals(\"Notes\");}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("faded");
            String sourceId2 = "image2/@title";
            String titleExpr = "#{javascript:this.getAlt()}";
            ValueBinding title = evaluator.createValueBinding(result, titleExpr, sourceId2,String.class);
            result.setValueBinding("title", title);
            String sourceId3 = "image2/xp:this.alt[1]/text()";
            String altExpr = "#{javascript:\"Inspect \" + scopeEntry}";
            ValueBinding alt = evaluator.createValueBinding(result, altExpr, sourceId3,String.class);
            result.setValueBinding("alt", alt);
            setId(result, "image2");
            result.setUrl("/.ibmxspres/domino/icons/vwicn011.gif");
            return result;
        }

        private UIComponent createText20(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0");
            return textComp;
        }

        private UIComponent createLink25(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link25/@rendered";
            String renderedExpr = "#{javascript:!scopeEntry.equals( dBar.BEAN_NAME )}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            String sourceId2 = "link25/xp:this.title[1]/text()";
            String titleExpr = "#{javascript:\"Remove variable \\\"\" + scopeEntry + \"\\\" from this scope\"}";
            ValueBinding title = evaluator.createValueBinding(result, titleExpr, sourceId2,String.class);
            result.setValueBinding("title", title);
            setId(result, "link25");
            String sourceId3 = "link25/xp:this.text[1]/text()";
            String textExpr = "#{javascript:( @ClientType().equals(\"Notes\") ? \"x\" : \"\");}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId3,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler27(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link25/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.clearScopeEntry(scopeEntry);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("repeatScope");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createImage1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspGraphicImage result = new XspGraphicImage();
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId = "image1/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:!@ClientType().equals(\"Notes\");}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("faded");
            String sourceId2 = "image1/@title";
            String titleExpr = "#{javascript:this.getAlt()}";
            ValueBinding title = evaluator.createValueBinding(result, titleExpr, sourceId2,String.class);
            result.setValueBinding("title", title);
            String sourceId3 = "image1/xp:this.alt[1]/text()";
            String altExpr = "#{javascript:\"Remove \" + scopeEntry + \" from this scope\"}";
            ValueBinding alt = evaluator.createValueBinding(result, altExpr, sourceId3,String.class);
            result.setValueBinding("alt", alt);
            setId(result, "image1");
            result.setUrl("/.ibmxspres/domino/icons/vwicn081.gif");
            return result;
        }

        private UIComponent createText21(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeatScope/tr[1]/td[1]/xp:text[1]/@value";
            String valueExpr = "#{scopeEntry}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTd5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createText22(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeatScope/tr[1]/td[2]/xp:text[1]/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:dBar.getScopeEntry(scopeEntry)}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createText23(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("</tbody></table>");
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createText24(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("<table class=\"grid\"><tbody>");
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createLogfiles(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "logFiles/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dBar.getActiveTab().equals(\"logs\")}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("content");
            setId(result, "logFiles");
            return result;
        }

        private UIComponent createDiv8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            return component;
        }

        private UIComponent createStrong(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("strong");
            return component;
        }

        private UIComponent createText25(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("(log) File:");
            return textComp;
        }

        private UIComponent createText26(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0");
            return textComp;
        }

        private UIComponent createComboboxlogfile(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspSelectOneMenu result = new XspSelectOneMenu();
            String sourceId = "comboBoxLogFile/@value";
            String valueExpr = "#{dBar.selectedLogFile}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "comboBoxLogFile");
            return result;
        }

        private UIComponent createSelectItem(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemEx result = new UISelectItemEx();
            result.setItemLabel("- select a file -");
            result.setItemValue("");
            return result;
        }

        private UIComponent createSelectItems(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemsEx result = new UISelectItemsEx();
            String sourceId = "comboBoxLogFile/xp:selectItems[1]/@value";
            String valueExpr = "#{dBar.logFileOptions}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            return result;
        }

        private UIComponent createEventHandler28(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "comboBoxLogFile/xp:eventHandler[1]/xp:this.onStart[1]/text()";
            String onStartExpr = "dojo.place(\"<span>Loading...</span>\", \"#{id:logFileContents}\", \"only\");";
            ValueBinding onStart = evaluator.createValueBinding(result, onStartExpr, sourceId,String.class);
            result.setValueBinding("onStart", onStart);
            result.setExecMode("partial");
            String sourceId2 = "comboBoxLogFile/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.showFileContents()}",
                    null,null, sourceId2);
            result.setAction(action);
            result.setRefreshId("logFiles");
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onchange");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText27(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0");
            return textComp;
        }

        private UIComponent createLink37(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link37");
            result.setText("refresh list");
            return result;
        }

        private UIComponent createEventHandler29(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link37/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.clearLogFileOptions()}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("logFiles");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("logFiles");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createSpan2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("span");
            component.addAttribute("style", "padding-left: 25px");
            return component;
        }

        private UIComponent createStrong2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("strong");
            return component;
        }

        private UIComponent createText28(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("Recent:");
            return textComp;
        }

        private UIComponent createText29(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0");
            return textComp;
        }

        private UIComponent createText30(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("no recent files found");
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId = "logFiles/div[1]/span[1]/xp:text[1]/@rendered";
            String renderedExpr = "#{javascript:!dBar.hasRecentFiles()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createRepeat1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeat1/@value";
            String valueExpr = "#{dBar.logFileHistory}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setDisableOutputTag(true);
            result.setIndexVar("index");
            result.setVar("fileHistoryEntry");
            result.setRows(30);
            setId(result, "repeat1");
            return result;
        }

        private UIComponent createLink41(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId = "link41/@title";
            String titleExpr = "#{javascript:@RightBack(fileHistoryEntry, java.io.File.separator)}";
            ValueBinding title = evaluator.createValueBinding(result, titleExpr, sourceId,String.class);
            result.setValueBinding("title", title);
            setId(result, "link41");
            String sourceId2 = "link41/xp:this.text[1]/text()";
            String textExpr = "#{javascript:var f = @RightBack(fileHistoryEntry, java.io.File.separator);\n\t\n\treturn (f.length>20 ? @Left(f, 20) : f); }";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId2,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler30(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "link41/xp:eventHandler[1]/xp:this.onStart[1]/text()";
            String onStartExpr = "dojo.html.set(dojo.byId(\"#{id:logFileContents}\"), \"Loading...\");";
            ValueBinding onStart = evaluator.createValueBinding(result, onStartExpr, sourceId,String.class);
            result.setValueBinding("onStart", onStart);
            result.setExecMode("partial");
            String sourceId2 = "link41/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setSelectedLogFile(fileHistoryEntry); dBar.showFileContents()}",
                    null,null, sourceId2);
            result.setAction(action);
            result.setRefreshId("logFiles");
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onclick");
            result.setExecId("logFiles");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText31(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue(" | ");
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId = "repeat1/xp:text[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:index<(dBar.getLogFileHistory().size()-1)}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createLogfilecontents(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            result.setStyle("margin-top:10px;");
            setId(result, "logFileContents");
            return result;
        }

        private UIComponent createDiv9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "logFileContents/xp:div[1]/@rendered";
            String renderedExpr = "#{!dBar.logFileMostRecent}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("dBarMsg");
            return result;
        }

        private UIComponent createText32(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = "A more recent version of this file is available. Click\u00a0";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createLink40(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link40");
            result.setText("here");
            return result;
        }

        private UIComponent createEventHandler31(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            String sourceId = "link40/xp:eventHandler[1]/xp:this.onStart[1]/text()";
            String onStartExpr = "dojo.html.set(dojo.byId(\"#{id:logFileContents}\"), \"Loading...\");";
            ValueBinding onStart = evaluator.createValueBinding(result, onStartExpr, sourceId,String.class);
            result.setValueBinding("onStart", onStart);
            result.setExecMode("partial");
            String sourceId2 = "link40/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.showFileContents();}",
                    null,null, sourceId2);
            result.setAction(action);
            result.setRefreshId("logFileContents");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText33(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0to refresh.");
            return textComp;
        }

        private UIComponent createText34(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            ConverterMethodBinding converter = new ConverterMethodBinding();
            String sourceId = "logFileContents/xp:text[1]/xp:this.converter[1]/xp:customConverter[1]/@getAsObject";
            MethodBinding getAsObject = evaluator.createMethodBinding(result,
                    "#{javascript:value;}",
                    new String[]{ "context", "component", "value" },
                    new Class[]{FacesContext.class, UIComponent.class, String.class}, sourceId);
            converter.setGetAsObject(getAsObject);
            String sourceId2 = "logFileContents/xp:text[1]/xp:this.converter[1]/xp:customConverter[1]/xp:this.getAsString[1]/text()";
            MethodBinding getAsString = evaluator.createMethodBinding(result,
                    "#{javascript:var r:String = @ReplaceSubstring(value, [\"\\n\", \"\\t\"], [\"<br />\", \"&nbsp;&nbsp;\"]);\nr\n\t.replaceAll(\"&lt;(.*?)&gt;\", \"<font color=\\\"blue\\\">&lt;$1&gt;</font>\")\n\t.replaceAll(\"&lt;&gt;\", \"<font color=\\\"red\\\">name=</font>\")\n\t.replaceAll(\"&gt;(.*?)&lt;\", \"&gt;<b>$1</b>&lt;\");}",
                    new String[]{ "context", "component", "value" },
                    new Class[]{FacesContext.class, UIComponent.class, Object.class}, sourceId2);
            converter.setGetAsString(getAsString);
            result.setConverter(converter);
            String sourceId3 = "logFileContents/xp:text[1]/@value";
            String valueExpr = "#{dBar.logFileContents}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId3,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createDiv10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "toolbarContents/xp:div[4]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dBar.getActiveTab().equals(\"customVars\")}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("content");
            return result;
        }

        private UIComponent createDiv11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "float:left; margin-right: 15px;");
            return component;
        }

        private UIComponent createDiv12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "font-weight:bold; margin-bottom: 3px");
            return component;
        }

        private UIComponent createText35(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("Environment");
            return textComp;
        }

        private UIComponent createTable(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("table");
            component.addAttribute("class", "grid");
            return component;
        }

        private UIComponent createTbody(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tbody");
            return component;
        }

        private UIComponent createTr4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTh(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("th");
            component.addAttribute("colspan", "2");
            return component;
        }

        private UIComponent createText36(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("USER");
            return textComp;
        }

        private UIComponent createRepeat3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeat3/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:dBar.getCustomVars(\'user\')}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("margin-bottom: 10px;");
            result.setVar("customEntry");
            result.setRows(1000);
            setId(result, "repeat3");
            return result;
        }

        private UIComponent createTr5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label");
            return component;
        }

        private UIComponent createText37(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat3/tr[1]/td[1]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.key}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTd7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createText38(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat3/tr[1]/td[2]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.value}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTr6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTh2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("th");
            component.addAttribute("colspan", "2");
            return component;
        }

        private UIComponent createText39(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("BROWSER");
            return textComp;
        }

        private UIComponent createRepeat4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeat4/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:dBar.getCustomVars(\'browser\')}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("margin-bottom: 10px;");
            result.setVar("customEntry");
            result.setRows(1000);
            setId(result, "repeat4");
            return result;
        }

        private UIComponent createTr7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label");
            return component;
        }

        private UIComponent createText40(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat4/tr[1]/td[1]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.key}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTd9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createText41(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat4/tr[1]/td[2]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.value}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTr8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTh3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("th");
            component.addAttribute("colspan", "2");
            return component;
        }

        private UIComponent createText42(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("SERVER");
            return textComp;
        }

        private UIComponent createRepeat6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeat6/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:dBar.getCustomVars(\'server\')}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("margin-bottom: 10px;");
            result.setVar("customEntry");
            result.setRows(1000);
            setId(result, "repeat6");
            return result;
        }

        private UIComponent createTr9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label");
            return component;
        }

        private UIComponent createText43(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat6/tr[1]/td[1]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.key}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTd11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createText44(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat6/tr[1]/td[2]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.value}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTr10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTh4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("th");
            component.addAttribute("colspan", "2");
            return component;
        }

        private UIComponent createText45(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("DATABASE");
            return textComp;
        }

        private UIComponent createRepeat5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeat5/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:dBar.getCustomVars(\'database\')}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("margin-bottom: 10px;");
            result.setVar("customEntry");
            result.setRows(1000);
            setId(result, "repeat5");
            return result;
        }

        private UIComponent createTr11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label");
            return component;
        }

        private UIComponent createText46(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat5/tr[1]/td[1]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.key}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTd13(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createText47(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat5/tr[1]/td[2]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.value}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTr12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd14(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label");
            return component;
        }

        private UIComponent createText48(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("Tools");
            return textComp;
        }

        private UIComponent createTd15(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createLink38(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link38");
            result.setText("Show all design note signers");
            return result;
        }

        private UIComponent createEventHandler32(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setExecMode("partial");
            String sourceId = "link38/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.dumpNoteSigners();}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("debugToolbar");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText49(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0(in messages tab)");
            return textComp;
        }

        private UIComponent createTr13(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTh5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("th");
            component.addAttribute("colspan", "2");
            return component;
        }

        private UIComponent createText50(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("REQUEST");
            return textComp;
        }

        private UIComponent createRepeat7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeat7/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:dBar.getCustomVars(\'request\')}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("margin-bottom: 10px;");
            result.setVar("customEntry");
            result.setRows(1000);
            setId(result, "repeat7");
            return result;
        }

        private UIComponent createTr14(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd16(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label");
            return component;
        }

        private UIComponent createText51(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat7/tr[1]/td[1]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.key}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createTd17(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createText52(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeat7/tr[1]/td[2]/xp:text[1]/@value";
            String valueExpr = "#{javascript:customEntry.value}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createDiv13(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "float:left; width: 350px;");
            return component;
        }

        private UIComponent createDiv14(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "font-weight:bold; margin-bottom: 3px");
            return component;
        }

        private UIComponent createText53(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("Persistent logging");
            return textComp;
        }

        private UIComponent createTable2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("table");
            component.addAttribute("class", "grid");
            return component;
        }

        private UIComponent createTbody2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tbody");
            return component;
        }

        private UIComponent createTr15(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd18(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label");
            return component;
        }

        private UIComponent createText54(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("status");
            return textComp;
        }

        private UIComponent createTd19(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createComputedfield3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "computedField3/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:(dBar.isLogEnabled() ? \"enabled\" : \"disabled\")}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            setId(result, "computedField3");
            return result;
        }

        private UIComponent createTr16(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd20(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label");
            return component;
        }

        private UIComponent createText55(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("database path");
            return textComp;
        }

        private UIComponent createTd21(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createComputedfield8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "computedField8/@value";
            String valueExpr = "#{dBar.logDbPath}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            String sourceId2 = "computedField8/@rendered";
            String renderedExpr = "#{!dBar.logDbValid}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "computedField8");
            return result;
        }

        private UIComponent createLink36(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            String sourceId = "link36/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:\"/.ibmxspres/domino/\" + dBar.getLogDbPath().replaceAll(\"\\\\\\\\\", \"/\");}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setTarget("_blank");
            result.setEscape(true);
            String sourceId2 = "link36/@rendered";
            String renderedExpr = "#{dBar.logDbValid}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link36");
            String sourceId3 = "link36/@text";
            String textExpr = "#{dBar.logDbPath}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId3,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createImage3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspGraphicImage result = new XspGraphicImage();
            result.setStyle("margin-left: 3px;");
            String sourceId = "image3/@title";
            String titleExpr = "#{javascript:this.getAlt()}";
            ValueBinding title = evaluator.createValueBinding(result, titleExpr, sourceId,String.class);
            result.setValueBinding("title", title);
            String sourceId2 = "image3/xp:this.alt[1]/text()";
            String altExpr = "#{javascript:(dBar.logDbValid ? \"Valid database\" : \"Invalid database\")}";
            ValueBinding alt = evaluator.createValueBinding(result, altExpr, sourceId2,String.class);
            result.setValueBinding("alt", alt);
            setId(result, "image3");
            String sourceId3 = "image3/xp:this.url[1]/text()";
            String urlExpr = "#{javascript:\"/.ibmxspres/domino/icons/\" + (dBar.logDbValid ? \"vwicn114.gif\" : \"vwicn115.gif\")}";
            ValueBinding url = evaluator.createValueBinding(result, urlExpr, sourceId3,String.class);
            result.setValueBinding("url", url);
            return result;
        }

        private UIComponent createTr17(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd22(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "label");
            return component;
        }

        private UIComponent createText56(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("log level");
            return textComp;
        }

        private UIComponent createTd23(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createText57(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "toolbarContents/xp:div[4]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/xp:text[1]/@value";
            String valueExpr = "#{dBar.logLevel}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createDiv15(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "margin-top: 3px");
            return component;
        }

        private UIComponent createText58(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = "You can store messages from the toolbar in documents in the current or an external database. The fields used in\n\t\t\t\t\t\t\tthis function are based on those used in the\u00a0";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createA2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("a");
            component.addAttribute("href", "http://www.openntf.org/projects/pmt.nsf/ProjectLookup/OpenLog");
            component.addAttribute("target", "_blank");
            return component;
        }

        private UIComponent createText59(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("OpenLog");
            return textComp;
        }

        private UIComponent createText60(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0project.");
            return textComp;
        }

        private UIComponent createJava(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            result.setStyle("margin-top: 15px");
            setId(result, "java");
            return result;
        }

        private UIComponent createDiv16(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "font-weight:bold; margin-bottom: 3px");
            return component;
        }

        private UIComponent createText61(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("Java memory usage");
            return textComp;
        }

        private UIComponent createText62(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "java/xp:text[1]/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:var rt = java.lang.Runtime.getRuntime();\n\tvar free = rt.freeMemory();\n\tvar total = rt.totalMemory();\n\tvar max = rt.maxMemory();\n\tvar used = total-free;\n\t\n\tvar barWidth = 300;\n\t\n\ttotalW = (total/max) * barWidth;\n\tmaxW = barWidth - totalW.toFixed(0);\n\tusedW = (used/total) * totalW.toFixed(0);\n\tfreeW = totalW - usedW.toFixed(0);\n\t\n\t\"<div style=\\\"border: 1px solid silver; padding: 2px; height: 13px; width: \" + barWidth + \"px;\\\">\" +\n\t\"<div style=\\\"height: 12px; width:\" + usedW.toFixed(0) + \"px; background: #D33939; float: left;\\\"></div>\" +\n\t\"<div style=\\\"height: 12px; width:\" + freeW.toFixed(0) + \"px; background: #039B03; float: left;\\\"></div>\" +\n\t\"<div style=\\\"height: 12px; width:\" + maxW.toFixed(0) + \"px; background: #FFFF6D; float: left;\\\"></div>\" + \n\t\"</div>\" +\n\t\"<div>(maximum heap size: \" + dBar.getReadableSize(max) + \")</div>\"\n\t\n\t}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createDiv17(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "margin: 10px 0");
            return component;
        }

        private UIComponent createTable3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("table");
            component.addAttribute("class", "grid");
            return component;
        }

        private UIComponent createTbody3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tbody");
            return component;
        }

        private UIComponent createText63(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "java/div[2]/table[1]/tbody[1]/xp:text[1]/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:var rt = java.lang.Runtime.getRuntime();\n\tvar free = rt.freeMemory();\n\tvar total = rt.totalMemory();\n\tvar max = rt.maxMemory();\n\tvar used = total-free;\n\t\n\t\"<tr><td class=\\\"label\\\" style=\\\"width: 150px;\\\"><div style=\\\"float:right; background: #D33939; width: 14px; height: 9px;\\\"></div>used</td><td>\" + dBar.getReadableSize(used) + \"</td></tr>\" +\n\t\"<tr><td class=\\\"label\\\" style=\\\"width: 150px;\\\"><div style=\\\"float:right; background: #039B03; width: 14px; height: 9px;\\\"></div>free</td><td>\" + dBar.getReadableSize(free) + \"</td></tr>\" +\n\t\"<tr><td class=\\\"label\\\" style=\\\"width: 150px;\\\"><div style=\\\"float:right; background: #D33939; width: 7px; height: 9px;\\\"></div><div style=\\\"float:right; background: #039B03; width: 7px; height: 9px;\\\"></div>total allocated</td><td>\" + dBar.getReadableSize(total) + \"</td></tr>\"\n\t}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createDiv18(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "margin: 10px 0");
            return component;
        }

        private UIComponent createLink28(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link28");
            result.setText("Run garbage collector");
            return result;
        }

        private UIComponent createEventHandler33(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link28/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:java.lang.Runtime.getRuntime().gc();}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("java");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createBr2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            component.addAttribute("style", "clear:both");
            return component;
        }

        private UIComponent createInspector(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "inspector/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dBar.getActiveTab().equals(\"inspector\")}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("content");
            setId(result, "inspector");
            return result;
        }

        private UIComponent createInspectorheader(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTable result = new XspTable();
            result.setStyle("margin-bottom: 5px;");
            setId(result, "inspectorHeader");
            return result;
        }

        private UIComponent createTr18(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd24(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createStrong3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("strong");
            return component;
        }

        private UIComponent createText64(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("Components on page:");
            return textComp;
        }

        private UIComponent createBr3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createText65(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("(");
            return textComp;
        }

        private UIComponent createLink15(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link15/@rendered";
            String renderedExpr = "#{javascript:!dBar.inspectorSortAlphabetic}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link15");
            result.setText("sort by id");
            return result;
        }

        private UIComponent createEventHandler34(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "link15/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setInspectorSortAlphabetic(true);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("inspectorHeader");
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLink30(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link30/@rendered";
            String renderedExpr = "#{javascript:dBar.inspectorSortAlphabetic}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link30");
            result.setText("sort by page order");
            return result;
        }

        private UIComponent createEventHandler35(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "link30/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setInspectorSortAlphabetic(false);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("inspectorHeader");
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText66(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(")");
            return textComp;
        }

        private UIComponent createTd25(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createComponentid(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspSelectOneMenu result = new XspSelectOneMenu();
            String sourceId = "componentId/@value";
            String valueExpr = "#{dBar.inspectorSelectedComponentId}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "componentId");
            return result;
        }

        private UIComponent createSelectItem2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemEx result = new UISelectItemEx();
            result.setItemLabel("select a component");
            result.setItemValue("");
            return result;
        }

        private UIComponent createSelectItems2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemsEx result = new UISelectItemsEx();
            String sourceId = "componentId/xp:selectItems[1]/@value";
            String valueExpr = "#{dBar.componentIds}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            return result;
        }

        private UIComponent createEventHandler36(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setRefreshId("inspector");
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onchange");
            String sourceId = "componentId/xp:eventHandler[1]/xp:this.script[1]/text()";
            MethodBinding script = evaluator.createMethodBinding(result,
                    "var src = thisEvent.target || thisEvent.srcElement;\n\t\tdojo.byId(\"#{id:inputExpression}\").value = \"getComponent(\\\"\" + src.options[src.selectedIndex].value + \"\\\")\";",
                    null,null, sourceId);
            result.setScript(script);
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText67(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0");
            return textComp;
        }

        private UIComponent createChkshowhiddencontrols(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputCheckbox result = new XspInputCheckbox();
            String sourceId = "chkShowHiddenControls/@value";
            String valueExpr = "#{dBar.inspectorShowHiddenComponents}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setUncheckedValue("hide");
            result.setCheckedValue("show");
            setId(result, "chkShowHiddenControls");
            result.setText("Include components without id");
            return result;
        }

        private UIComponent createEventHandler37(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setExecMode("partial");
            result.setRefreshId("componentId");
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onclick");
            result.setExecId("inspector");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createBr4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createRepeat2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeat2/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:[\"view\", \"context\", \"facesContext\", \"database\", \"session\"];}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("margin-top:3px");
            result.setVar("inspectEntry");
            result.setRows(30);
            setId(result, "repeat2");
            return result;
        }

        private UIComponent createLink19(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setStyle("margin-right: 5px");
            result.setEscape(true);
            setId(result, "link19");
            String sourceId = "link19/@text";
            String textExpr = "#{inspectEntry}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler38(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "link19/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setInspectorExpression(inspectEntry)}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createTd26(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("style", "padding-left: 20px");
            return component;
        }

        private UIComponent createStrong4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("strong");
            return component;
        }

        private UIComponent createText68(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("Previous:");
            return textComp;
        }

        private UIComponent createTd27(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createCbprevexp(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspSelectOneMenu result = new XspSelectOneMenu();
            setId(result, "cbPrevExp");
            return result;
        }

        private UIComponent createSelectItem3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemEx result = new UISelectItemEx();
            result.setItemLabel("");
            result.setItemValue("");
            return result;
        }

        private UIComponent createSelectItems3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemsEx result = new UISelectItemsEx();
            String sourceId = "cbPrevExp/xp:selectItems[1]/@value";
            String valueExpr = "#{dBar.inspectorHistory}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            return result;
        }

        private UIComponent createEventHandler39(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setExecMode("partial");
            String sourceId = "cbPrevExp/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setInspectorExpression(this.getParent().getValue());}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("inspector");
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onchange");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createTr19(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTr20(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd28(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createStrong5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("strong");
            return component;
        }

        private UIComponent createText69(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("Expression:");
            return textComp;
        }

        private UIComponent createTd29(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("colspan", "3");
            return component;
        }

        private UIComponent createInputexpression(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            String sourceId = "inputExpression/@value";
            String valueExpr = "#{dBar.inspectorExpression}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyleClass("expression");
            setId(result, "inputExpression");
            return result;
        }

        private UIComponent createEventHandler40(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onkeypress");
            MethodBinding script = evaluator.createMethodBinding(result,
                    "//partial refresh on Enter\n\t\t\t\t\t\t\t\t\tif( thisEvent.keyCode === dojo.keys.ENTER ){\n\t\t\t\t\t\tdojo.stopEvent( thisEvent );\n\t\t\t\t\t} else {\t\t\n\t\t\t\t\t\treturn false;\n\t\t\t\t\t}\n\t\t\t\t\t",
                    null,null, null);
            result.setScript(script);
            result.setRefreshMode("full");
            return result;
        }

        private UIComponent createText70(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0");
            return textComp;
        }

        private UIComponent createLink31(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(false);
            String sourceId = "link31/@rendered";
            String renderedExpr = "#{javascript:dBar.expressionMultipleComponents}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link31");
            result.setText("&laquo; step back");
            return result;
        }

        private UIComponent createEventHandler41(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "link31/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.removeExpressionComponent();}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("inspector");
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createBr5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createI(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("i");
            return component;
        }

        private UIComponent createText71(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = "(click Enter to execute the expression)";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createDiv19(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            return component;
        }

        private UIComponent createText72(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("Invalid expression");
            result.setStyle("color:red");
            String sourceId = "inspector/div[1]/xp:text[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:( !dBar.hasInspectorResult() && !facesContext.getMessages( \'inspectorMessages\' ).hasNext() );}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createDiv20(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            return component;
        }

        private UIComponent createText73(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "inspector/div[2]/xp:text[1]/@value";
            String valueExpr = "#{javascript:\'Exception:\' + dBar.getInspectorExceptionOutput()}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("color:red");
            String sourceId2 = "inspector/div[2]/xp:text[1]/@rendered";
            String renderedExpr = "#{javascript:dBar.hasInspectorException()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createPre(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("pre");
            return component;
        }

        private UIComponent createInspectormessages(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspMessages result = new XspMessages();
            result.setTitle("Press left mouse button to show entire message");
            setId(result, "inspectorMessages");
            return result;
        }

        private UIComponent createExpressioninfo(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            String sourceId = "expressionInfo/@rendered";
            String renderedExpr = "#{javascript:dBar.hasInspectorResult();}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "expressionInfo");
            return result;
        }

        private UIComponent createDiv21(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "expressionInfo/xp:div[1]/@rendered";
            String renderedExpr = "#{javascript:dBar.hasInspectorResult();}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("className");
            return result;
        }

        private UIComponent createB(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("b");
            return component;
        }

        private UIComponent createLink44(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            String sourceId = "link44/@value";
            String valueExpr = "#{javascript:dBar.getInspectorLink(dBar.getInspectorResultClassName())}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setTarget("_blank");
            result.setEscape(true);
            String sourceId2 = "link44/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:!dBar.getInspectorResultClassName().equals(\"void\")}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link44");
            String sourceId3 = "link44/@text";
            String textExpr = "#{javascript:dBar.getInspectorResultClassName();}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId3,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createBr6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createExpressionvalue(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "expressionValue/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:\"toString: <b>\" + dBar.getInspectorResultValue() + \"</b>\";}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId2 = "expressionValue/@rendered";
            String renderedExpr = "#{javascript:dBar.getInspectorResultValue();}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "expressionValue");
            return result;
        }

        private UIComponent createDiv22(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("style", "margin: 5px 0");
            return component;
        }

        private UIComponent createLink35(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link35/@rendered";
            String renderedExpr = "#{dBar.inspectorDeclaredOnly}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link35");
            result.setText("show all methods/fields");
            return result;
        }

        private UIComponent createEventHandler42(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link35/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setInspectorDeclaredOnly( !dBar.inspectorDeclaredOnly)}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("expressionInfo");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("expressionInfo");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createLink32(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            String sourceId = "link32/@rendered";
            String renderedExpr = "#{!dBar.inspectorDeclaredOnly}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link32");
            result.setText("show declared methods/fields only");
            return result;
        }

        private UIComponent createEventHandler43(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link32/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setInspectorDeclaredOnly( !dBar.inspectorDeclaredOnly)}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("expressionInfo");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("expressionInfo");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createSpan3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspSpan result = new XspSpan();
            String sourceId = "expressionInfo/div[1]/xp:span[1]/@rendered";
            String renderedExpr = "#{!dBar.inspectorHideMethods}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createText74(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createLink10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link10");
            result.setText("hide methods and fields");
            return result;
        }

        private UIComponent createEventHandler44(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            result.setExecMode("partial");
            String sourceId = "link10/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.setInspectorHideMethods(true)}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("expressionInfo");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setExecId("expressionInfo");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createTable4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTable result = new XspTable();
            String sourceId = "expressionInfo/xp:table[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:var expressionInfo = dBar.hasInspectorResult();\n\t\t\t\t\t\t\tif (!expressionInfo) { return false; }\n\t\t\t\t\t\t\tif (dBar.inspectorHideMethods) { return false; }\n\t\t\t\t\t\t\treturn true;}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("grid striped inspect");
            return result;
        }

        private UIComponent createRepeatmethods(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeatMethods/@value";
            String valueExpr = "#{javascript:dBar.getInspectorMethodList()}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setDisableOutputTag(true);
            String sourceId2 = "repeatMethods/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dBar.hasInspectorResult();}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setVar("method");
            result.setRows(500);
            setId(result, "repeatMethods");
            return result;
        }

        private UIComponent createTr21(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd30(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "returns");
            return component;
        }

        private UIComponent createLink7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            String sourceId = "link7/@value";
            String valueExpr = "#{javascript:dBar.getInspectorLink(method.getReturnType().getCanonicalName())}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setTarget("_blank");
            result.setEscape(true);
            String sourceId2 = "link7/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:!method.getReturnType().getCanonicalName().equals(\"void\")}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link7");
            String sourceId3 = "link7/@text";
            String textExpr = "#{method.returnType.canonicalName}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId3,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createComputedfield4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "computedField4/@value";
            String valueExpr = "#{method.returnType.canonicalName}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            String sourceId2 = "computedField4/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:method.getReturnType().getCanonicalName().equals(\"void\")}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "computedField4");
            return result;
        }

        private UIComponent createTd31(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createStrong6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("strong");
            return component;
        }

        private UIComponent createLink42(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link42");
            String sourceId = "link42/@text";
            String textExpr = "#{method.name}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler45(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "link42/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:var c = method.getName() + \"(\" + dBar.getCanonicalNames(method.getParameterTypes()).join(\", \") + \")\";\ndBar.addInspectorExpressionComponent(c);}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("inspector");
            String sourceId2 = "link42/xp:eventHandler[1]/xp:this.onComplete[1]/text()";
            String onCompleteExpr = "try {\n\twindow.scrollTo(0,0);\n\tdojo.byId(\"#{id:inputExpression}\").focus();\n} catch (e) { }";
            ValueBinding onComplete = evaluator.createValueBinding(result, onCompleteExpr, sourceId2,String.class);
            result.setValueBinding("onComplete", onComplete);
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createText75(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("(");
            return textComp;
        }

        private UIComponent createRepeatpm(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeatPM/@value";
            String valueExpr = "#{method.parameterTypes}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setDisableOutputTag(true);
            result.setIndexVar("paramIndex");
            result.setVar("parameter");
            result.setRows(30);
            setId(result, "repeatPM");
            return result;
        }

        private UIComponent createLink43(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            String sourceId = "link43/@value";
            String valueExpr = "#{javascript:dBar.getInspectorLink(parameter.canonicalName)}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setTarget("_blank");
            result.setEscape(true);
            setId(result, "link43");
            String sourceId2 = "link43/@text";
            String textExpr = "#{parameter.canonicalName}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId2,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createText76(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue(", ");
            result.setEscape(true);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId = "repeatPM/xp:text[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:paramIndex < (getComponent(\'repeatPM\').getRowCount()-1)}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createText77(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(")");
            return textComp;
        }

        private UIComponent createBr7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createText78(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "repeatMethods/tr[1]/td[2]/xp:text[1]/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:\"throws \" + dBar.getCanonicalNames(method.getExceptionTypes()).join(\", \");}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("margin-left: 10px;");
            String sourceId2 = "repeatMethods/tr[1]/td[2]/xp:text[1]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:method.getExceptionTypes().length>0}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createTd32(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "inherits");
            return component;
        }

        private UIComponent createText79(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("n/a");
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId = "repeatMethods/tr[1]/td[3]/xp:text[1]/@rendered";
            String renderedExpr = "#{javascript:method.getDeclaringClass().getCanonicalName().equals(dBar.getInspectorResultClassName())}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createLinkdeclclass(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            String sourceId = "linkDeclClass/@value";
            String valueExpr = "#{javascript:dBar.getInspectorLink(method.declaringClass.canonicalName)}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setTarget("_blank");
            result.setEscape(true);
            String sourceId2 = "linkDeclClass/@rendered";
            String renderedExpr = "#{javascript:!method.getDeclaringClass().getCanonicalName().equals(dBar.getInspectorResultClassName())}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "linkDeclClass");
            String sourceId3 = "linkDeclClass/@text";
            String textExpr = "#{method.declaringClass.canonicalName}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId3,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createText80(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String value = "<tr><th colspan=\"3\">Methods</th></tr><tr><th>Returns</th><th>Name</th><th>Inherited from</th></tr></thead><tbody>";
            result.setValue(value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createRepeatfields(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "repeatFields/@value";
            String valueExpr = "#{javascript:dBar.getInspectorFielsList()}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setDisableOutputTag(true);
            String sourceId2 = "repeatFields/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dBar.hasInspectorResult();}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setVar("field");
            result.setRows(500);
            setId(result, "repeatFields");
            return result;
        }

        private UIComponent createTr22(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd33(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "returns");
            return component;
        }

        private UIComponent createLink45(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            String sourceId = "link45/@value";
            String valueExpr = "#{javascript:dBar.getInspectorLink(field.getType().getCanonicalName())}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setTarget("_blank");
            result.setEscape(true);
            String sourceId2 = "link45/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:!field.getType().getCanonicalName().equals(\"void\")}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "link45");
            String sourceId3 = "link45/@text";
            String textExpr = "#{field.type.canonicalName}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId3,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createComputedfield5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "computedField5/@value";
            String valueExpr = "#{field.type.canonicalName}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            String sourceId2 = "computedField5/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:field.getType().getCanonicalName().equals(\"void\")}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            setId(result, "computedField5");
            return result;
        }

        private UIComponent createTd34(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createStrong7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("strong");
            return component;
        }

        private UIComponent createLink46(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link46");
            String sourceId = "link46/@text";
            String textExpr = "#{field.name}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createEventHandler46(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "link46/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.addInspectorExpressionComponent( field.name );}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("inspector");
            String sourceId2 = "link46/xp:eventHandler[1]/xp:this.onComplete[1]/text()";
            String onCompleteExpr = "try {\n\twindow.scrollTo(0,0);\n\tdojo.byId(\"#{id:inputExpression}\").focus();\n} catch (e) { }";
            ValueBinding onComplete = evaluator.createValueBinding(result, onCompleteExpr, sourceId2,String.class);
            result.setValueBinding("onComplete", onComplete);
            result.setSubmit(true);
            result.setDisableValidators(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createTd35(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("class", "inherits");
            return component;
        }

        private UIComponent createLink(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            String sourceId = "repeatFields/tr[1]/td[3]/xp:link[1]/@value";
            String valueExpr = "#{javascript:dBar.getInspectorLink(field.declaringClass.canonicalName)}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setTarget("_blank");
            result.setEscape(true);
            String sourceId2 = "repeatFields/tr[1]/td[3]/xp:link[1]/@rendered";
            String renderedExpr = "#{javascript:!field.getDeclaringClass().getCanonicalName().equals(dBar.getInspectorResultClassName())}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId2,boolean.class);
            result.setValueBinding("rendered", rendered);
            String sourceId3 = "repeatFields/tr[1]/td[3]/xp:link[1]/@text";
            String textExpr = "#{field.declaringClass.canonicalName}";
            ValueBinding text = evaluator.createValueBinding(result, textExpr, sourceId3,String.class);
            result.setValueBinding("text", text);
            return result;
        }

        private UIComponent createText81(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("n/a");
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            String sourceId = "repeatFields/tr[1]/td[3]/xp:text[1]/@rendered";
            String renderedExpr = "#{javascript:field.getDeclaringClass().getCanonicalName().equals(dBar.getInspectorResultClassName())}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createText82(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String value = "<tr><th colspan=\"3\">Fields</th></tr><tr><th>Type</th><th>Name</th><th>Inherited from</th></tr></thead><tbody>";
            result.setValue(value);
            result.setEscape(false);
            Map<String,Object> attrs = getAttributes(result);
            attrs.put("disableTheme", Boolean.valueOf("true"));
            return result;
        }

        private UIComponent createDiv23(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "toolbarContents/xp:div[6]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dBar.getActiveTab().equals(\"about\")}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createDiv24(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            result.setStyleClass("content");
            return result;
        }

        private UIComponent createDiv25(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("div");
            component.addAttribute("class", "aboutMe");
            return component;
        }

        private UIComponent createTable5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("table");
            return component;
        }

        private UIComponent createTbody4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tbody");
            return component;
        }

        private UIComponent createTr23(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd36(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createImg(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("img");
            component.addAttribute("alt", "Hi !");
            component.addAttribute("height", "80");
            component.addAttribute("src", "http://secure.gravatar.com/avatar/80b0217f17f01b662fe26275fd625584?size=80");
            component.addAttribute("title", "Hi !");
            component.addAttribute("width", "80");
            return component;
        }

        private UIComponent createTd37(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            return component;
        }

        private UIComponent createText83(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = "The XPages Debug Toolbar is created and maintained by Mark Leusink. Download the latest release\n\t\t\t\t\t\t\t\t\t\t\tfrom\u00a0";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createLink47(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            String value = "http://www.openntf.org/internal/home.nsf/project.xsp?action=openDocument&name=XPage%20Debug%20Toolbar";
            result.setValue(value);
            result.setTarget("_blank");
            result.setText("OpenNTF");
            return result;
        }

        private UIComponent createText84(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = "\u00a0or the source directly from\u00a0";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createLink48(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setValue("https://www.github.com/openntf/DebugToolbar");
            result.setTarget("_blank");
            result.setText("GitHub");
            return result;
        }

        private UIComponent createText85(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = ". This project is part of the\u00a0";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createA3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("a");
            component.addAttribute("href", "http://essentials.openntf.org");
            component.addAttribute("target", "_blank");
            return component;
        }

        private UIComponent createText86(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("OpenNTF Essentials");
            return textComp;
        }

        private UIComponent createText87(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(".");
            return textComp;
        }

        private UIComponent createBr8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createBr9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createA4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("a");
            component.addAttribute("href", "http://linqed.eu");
            component.addAttribute("target", "_blank");
            return component;
        }

        private UIComponent createText88(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("blog");
            return textComp;
        }

        private UIComponent createText89(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createA5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("a");
            component.addAttribute("href", "http://nl.linkedin.com/in/mleusink");
            component.addAttribute("target", "_blank");
            return component;
        }

        private UIComponent createText90(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("linkedIn");
            return textComp;
        }

        private UIComponent createText91(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0|\u00a0");
            return textComp;
        }

        private UIComponent createA6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("a");
            component.addAttribute("href", "http://www.twitter.com/markleusink");
            component.addAttribute("target", "_blank");
            return component;
        }

        private UIComponent createText92(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("twitter");
            return textComp;
        }

        private UIComponent createTr24(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("tr");
            return component;
        }

        private UIComponent createTd38(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("td");
            component.addAttribute("colspan", "2");
            return component;
        }

        private UIComponent createText93(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = "Looking for an expert in IBM XPages or Domino development (client, web, mobile)? Or need\n\t\t\t\t\t\t\t\t\t\t\tassistance in using this or any of my other projects?";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createBr10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createBr11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createText94(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("Contact me at\u00a0");
            return textComp;
        }

        private UIComponent createA7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("a");
            component.addAttribute("href", "mailto:m.leusink@linqed.eu?subject=I%20love%20the%20XPage%20Debug%20Toolbar");
            component.addAttribute("target", "_blank");
            return component;
        }

        private UIComponent createText95(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("m.leusink@linqed.eu");
            return textComp;
        }

        private UIComponent createText96(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText("\u00a0!");
            return textComp;
        }

        private UIComponent createBr12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("br");
            return component;
        }

        private UIComponent createP(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("p");
            component.addAttribute("style", "margin-top: 10px;");
            return component;
        }

        private UIComponent createText97(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = "(the XPages Debug Toolbar features parts of Tommy Valand\'s\u00a0";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createLink13(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            String sourceId = "link13/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:\"http://www.openntf.org/internal/home.nsf/project.xsp?action=openDocument&name=XPages%20API%20Inspector\"}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setTarget("_blank");
            result.setEscape(true);
            setId(result, "link13");
            result.setText("API Inspector");
            return result;
        }

        private UIComponent createText98(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(", version 5)");
            return textComp;
        }

        private UIComponent createDiv26(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            String sourceId = "debugToolbar/xp:div[4]/xp:this.rendered[1]/text()";
            String renderedExpr = "#{javascript:dBar.getActiveTab().length>0 && !dBar.isCollapsed()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("hideContent bg");
            return result;
        }

        private UIComponent createUl4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("ul");
            component.addAttribute("class", "links");
            return component;
        }

        private UIComponent createLi13(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink39(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setValue("#dBar");
            result.setEscape(false);
            setId(result, "link39");
            result.setText("top");
            return result;
        }

        private UIComponent createLi14(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("li");
            return component;
        }

        private UIComponent createLink4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link4");
            result.setText("close");
            return result;
        }

        private UIComponent createEventHandler47(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            String sourceId = "link4/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:dBar.close();}",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("debugToolbar");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

    }
}
