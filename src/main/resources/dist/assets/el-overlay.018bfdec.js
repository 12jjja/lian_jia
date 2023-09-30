import{ah as ee,Y as ue,au as ie,aM as X,i as re,aN as de,q as x,aO as ce,a9 as oe,al as J,w as K,an as fe,ak as me,aP as ve,am as pe,aQ as U,Q as j,T as W,m as Z,W as R,F as g,a4 as ye,R as Ce,V as Ee,b as Q,aR as be,c as H,s as h,C as V,y as _,D as T,B as o,I as ge,x as A,v as G,K as Te,S as Se,J as q,L as ke,aB as Me,_ as te,aS as we,aT as Ae,g as De,a6 as Le,aA as F,r as D,aU as Ie,aV as he,n as Be,l as Oe,aW as P,p as Ne,aX as Re,M as Ye,z as $e,aq as _e,aw as ze,aY as He,aC as Ue,aZ as Ve,O as Xe}from"./index.28248d25.js";import{g as Ke,U as se}from"./el-input.065a4d4c.js";var z=(e=>(e[e.TEXT=1]="TEXT",e[e.CLASS=2]="CLASS",e[e.STYLE=4]="STYLE",e[e.PROPS=8]="PROPS",e[e.FULL_PROPS=16]="FULL_PROPS",e[e.HYDRATE_EVENTS=32]="HYDRATE_EVENTS",e[e.STABLE_FRAGMENT=64]="STABLE_FRAGMENT",e[e.KEYED_FRAGMENT=128]="KEYED_FRAGMENT",e[e.UNKEYED_FRAGMENT=256]="UNKEYED_FRAGMENT",e[e.NEED_PATCH=512]="NEED_PATCH",e[e.DYNAMIC_SLOTS=1024]="DYNAMIC_SLOTS",e[e.HOISTED=-1]="HOISTED",e[e.BAIL=-2]="BAIL",e))(z||{});const ne=Symbol("dialogInjectionKey"),We=(e,t,r)=>{let a={offsetX:0,offsetY:0};const i=l=>{const d=l.clientX,v=l.clientY,{offsetX:m,offsetY:p}=a,s=e.value.getBoundingClientRect(),f=s.left,S=s.top,B=s.width,O=s.height,L=document.documentElement.clientWidth,N=document.documentElement.clientHeight,I=-f+m,k=-S+p,M=L-f-B+m,C=N-S-O+p,w=y=>{const E=Math.min(Math.max(m+y.clientX-d,I),M),Y=Math.min(Math.max(p+y.clientY-v,k),C);a={offsetX:E,offsetY:Y},e.value.style.transform=`translate(${X(E)}, ${X(Y)})`},n=()=>{document.removeEventListener("mousemove",w),document.removeEventListener("mouseup",n)};document.addEventListener("mousemove",w),document.addEventListener("mouseup",n)},c=()=>{t.value&&e.value&&t.value.addEventListener("mousedown",i)},u=()=>{t.value&&e.value&&t.value.removeEventListener("mousedown",i)};ee(()=>{ue(()=>{r.value?c():u()})}),ie(()=>{u()})},Ge=e=>{re(e)||de("[useLockscreen]","You need to pass a ref param to this function");const t=x("popup"),r=ce(()=>t.bm("parent","hidden"));if(!oe||J(document.body,r.value))return;let a=0,i=!1,c="0";const u=()=>{pe(document.body,r.value),i&&(document.body.style.width=c)};K(e,l=>{if(!l){u();return}i=!J(document.body,r.value),i&&(c=document.body.style.width),a=Ke(t.namespace.value);const d=document.documentElement.clientHeight<document.body.scrollHeight,v=fe(document.body,"overflowY");a>0&&(d||v==="scroll")&&i&&(document.body.style.width=`calc(100% - ${a}px)`),me(document.body,r.value)}),ve(()=>u())},le=e=>{if(!e)return{onClick:U,onMousedown:U,onMouseup:U};let t=!1,r=!1;return{onClick:u=>{t&&r&&e(u),t=r=!1},onMousedown:u=>{t=u.target===u.currentTarget},onMouseup:u=>{r=u.target===u.currentTarget}}},qe=j({mask:{type:Boolean,default:!0},customMaskEvent:{type:Boolean,default:!1},overlayClass:{type:W([String,Array,Object])},zIndex:{type:W([String,Number])}}),xe={click:e=>e instanceof MouseEvent};var je=Z({name:"ElOverlay",props:qe,emits:xe,setup(e,{slots:t,emit:r}){const a=x("overlay"),i=d=>{r("click",d)},{onClick:c,onMousedown:u,onMouseup:l}=le(e.customMaskEvent?void 0:i);return()=>e.mask?R("div",{class:[a.b(),e.overlayClass],style:{zIndex:e.zIndex},onClick:c,onMousedown:u,onMouseup:l},[g(t,"default")],z.STYLE|z.CLASS|z.PROPS,["onClick","onMouseup","onMousedown"]):ye("div",{class:e.overlayClass,style:{zIndex:e.zIndex,position:"fixed",top:"0px",right:"0px",bottom:"0px",left:"0px"}},[g(t,"default")])}});const Ze=je,ae=j({center:{type:Boolean,default:!1},closeIcon:{type:Ce,default:""},customClass:{type:String,default:""},draggable:{type:Boolean,default:!1},fullscreen:{type:Boolean,default:!1},showClose:{type:Boolean,default:!0},title:{type:String,default:""}}),Je={close:()=>!0},Qe=["aria-label"],Fe=["id"],Pe={name:"ElDialogContent"},eo=Z({...Pe,props:ae,emits:Je,setup(e){const t=e,{t:r}=Ee(),{Close:a}=we,{dialogRef:i,headerRef:c,bodyId:u,ns:l,style:d}=Q(ne),{focusTrapRef:v}=Q(be),m=Ae(v,i),p=H(()=>t.draggable);return We(i,c,p),(s,f)=>(h(),V("div",{ref:o(m),class:T([o(l).b(),o(l).is("fullscreen",s.fullscreen),o(l).is("draggable",o(p)),{[o(l).m("center")]:s.center},s.customClass]),style:ke(o(d)),tabindex:"-1",onClick:f[1]||(f[1]=Me(()=>{},["stop"]))},[_("header",{ref_key:"headerRef",ref:c,class:T(o(l).e("header"))},[g(s.$slots,"header",{},()=>[_("span",{role:"heading",class:T(o(l).e("title"))},ge(s.title),3)]),s.showClose?(h(),V("button",{key:0,"aria-label":o(r)("el.dialog.close"),class:T(o(l).e("headerbtn")),type:"button",onClick:f[0]||(f[0]=S=>s.$emit("close"))},[R(o(Se),{class:T(o(l).e("close"))},{default:A(()=>[(h(),G(Te(s.closeIcon||o(a))))]),_:1},8,["class"])],10,Qe)):q("v-if",!0)],2),_("div",{id:o(u),class:T(o(l).e("body"))},[g(s.$slots,"default")],10,Fe),s.$slots.footer?(h(),V("footer",{key:0,class:T(o(l).e("footer"))},[g(s.$slots,"footer")],2)):q("v-if",!0)],6))}});var oo=te(eo,[["__file","/home/runner/work/element-plus/element-plus/packages/components/dialog/src/dialog-content.vue"]]);const to=j({...ae,appendToBody:{type:Boolean,default:!1},beforeClose:{type:W(Function)},destroyOnClose:{type:Boolean,default:!1},closeOnClickModal:{type:Boolean,default:!0},closeOnPressEscape:{type:Boolean,default:!0},lockScroll:{type:Boolean,default:!0},modal:{type:Boolean,default:!0},openDelay:{type:Number,default:0},closeDelay:{type:Number,default:0},top:{type:String},modelValue:{type:Boolean,default:!1},modalClass:String,width:{type:[String,Number]},zIndex:{type:Number},trapFocus:{type:Boolean,default:!1}}),so={open:()=>!0,opened:()=>!0,close:()=>!0,closed:()=>!0,[se]:e=>De(e),openAutoFocus:()=>!0,closeAutoFocus:()=>!0},no=(e,t)=>{const a=Oe().emit,{nextZIndex:i}=Le();let c="";const u=F(),l=F(),d=D(!1),v=D(!1),m=D(!1),p=D(e.zIndex||i());let s,f;const S=Ie("namespace",he),B=H(()=>{const b={},$=`--${S.value}-dialog`;return e.fullscreen||(e.top&&(b[`${$}-margin-top`]=e.top),e.width&&(b[`${$}-width`]=X(e.width))),b});function O(){a("opened")}function L(){a("closed"),a(se,!1),e.destroyOnClose&&(m.value=!1)}function N(){a("close")}function I(){f==null||f(),s==null||s(),e.openDelay&&e.openDelay>0?{stop:s}=P(()=>w(),e.openDelay):w()}function k(){s==null||s(),f==null||f(),e.closeDelay&&e.closeDelay>0?{stop:f}=P(()=>n(),e.closeDelay):n()}function M(){function b($){$||(v.value=!0,d.value=!1)}e.beforeClose?e.beforeClose(b):k()}function C(){e.closeOnClickModal&&M()}function w(){!oe||(d.value=!0)}function n(){d.value=!1}function y(){a("openAutoFocus")}function E(){a("closeAutoFocus")}e.lockScroll&&Ge(d);function Y(){e.closeOnPressEscape&&M()}return K(()=>e.modelValue,b=>{b?(v.value=!1,I(),m.value=!0,p.value=e.zIndex?p.value++:i(),Be(()=>{a("open"),t.value&&(t.value.scrollTop=0)})):d.value&&k()}),K(()=>e.fullscreen,b=>{!t.value||(b?(c=t.value.style.transform,t.value.style.transform=""):t.value.style.transform=c)}),ee(()=>{e.modelValue&&(d.value=!0,m.value=!0,I())}),{afterEnter:O,afterLeave:L,beforeLeave:N,handleClose:M,onModalClick:C,close:k,doClose:n,onOpenAutoFocus:y,onCloseAutoFocus:E,onCloseRequested:Y,titleId:u,bodyId:l,closed:v,style:B,rendered:m,visible:d,zIndex:p}},lo=["aria-label","aria-labelledby","aria-describedby"],ao={name:"ElDialog"},uo=Z({...ao,props:to,emits:so,setup(e,{expose:t}){const r=e,a=Ne();Re({scope:"el-dialog",from:"the title slot",replacement:"the header slot",version:"3.0.0",ref:"https://element-plus.org/en-US/component/dialog.html#slots"},H(()=>!!a.title));const i=x("dialog"),c=D(),u=D(),l=D(),{visible:d,titleId:v,bodyId:m,style:p,rendered:s,zIndex:f,afterEnter:S,afterLeave:B,beforeLeave:O,handleClose:L,onModalClick:N,onOpenAutoFocus:I,onCloseAutoFocus:k,onCloseRequested:M}=no(r,c);Ye(ne,{dialogRef:c,headerRef:u,bodyId:m,ns:i,rendered:s,style:p});const C=le(N),w=H(()=>r.draggable&&!r.fullscreen);return t({visible:d,dialogContentRef:l}),(n,y)=>(h(),G(Ve,{to:"body",disabled:!n.appendToBody},[R(Ue,{name:"dialog-fade",onAfterEnter:o(S),onAfterLeave:o(B),onBeforeLeave:o(O),persisted:""},{default:A(()=>[$e(R(o(Ze),{"custom-mask-event":"",mask:n.modal,"overlay-class":n.modalClass,"z-index":o(f)},{default:A(()=>[_("div",{role:"dialog","aria-modal":"true","aria-label":n.title||void 0,"aria-labelledby":n.title?void 0:o(v),"aria-describedby":o(m),class:T(`${o(i).namespace.value}-overlay-dialog`),onClick:y[0]||(y[0]=(...E)=>o(C).onClick&&o(C).onClick(...E)),onMousedown:y[1]||(y[1]=(...E)=>o(C).onMousedown&&o(C).onMousedown(...E)),onMouseup:y[2]||(y[2]=(...E)=>o(C).onMouseup&&o(C).onMouseup(...E))},[R(o(ze),{loop:"",trapped:o(d),"focus-start-el":"container",onFocusAfterTrapped:o(I),onFocusAfterReleased:o(k),onReleaseRequested:o(M)},{default:A(()=>[o(s)?(h(),G(oo,{key:0,ref_key:"dialogContentRef",ref:l,"custom-class":n.customClass,center:n.center,"close-icon":n.closeIcon,draggable:o(w),fullscreen:n.fullscreen,"show-close":n.showClose,title:n.title,onClose:o(L)},He({header:A(()=>[n.$slots.title?g(n.$slots,"title",{key:1}):g(n.$slots,"header",{key:0,close:o(L),titleId:o(v),titleClass:o(i).e("title")})]),default:A(()=>[g(n.$slots,"default")]),_:2},[n.$slots.footer?{name:"footer",fn:A(()=>[g(n.$slots,"footer")])}:void 0]),1032,["custom-class","center","close-icon","draggable","fullscreen","show-close","title","onClose"])):q("v-if",!0)]),_:3},8,["trapped","onFocusAfterTrapped","onFocusAfterReleased","onReleaseRequested"])],42,lo)]),_:3},8,["mask","overlay-class","z-index"]),[[_e,o(d)]])]),_:3},8,["onAfterEnter","onAfterLeave","onBeforeLeave"])],8,["disabled"]))}});var io=te(uo,[["__file","/home/runner/work/element-plus/element-plus/packages/components/dialog/src/dialog.vue"]]);const fo=Xe(io);export{Ze as E,Ge as a,le as b,fo as c,We as u};