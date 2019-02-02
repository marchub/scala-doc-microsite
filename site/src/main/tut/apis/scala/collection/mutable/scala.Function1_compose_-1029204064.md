//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#compose[A](g:A=>T1):A=>R">scala.Function1#compose</a></li>
<li name="scala.Function1#compose" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="compose[A](g:A=>T1):A=>R"></a><a id="compose[A]((A)⇒Int):(A)⇒A"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#compose[A](g:A=>T1):A=>R" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">compose</span><span class="tparams">[<span name="A">A</span>]</span><span class="params">(<span name="g">g: (<span class="extype" name="scala.Function1.compose.A">A</span>) ⇒ <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: (<span class="extype" name="scala.Function1.compose.A">A</span>) ⇒ <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span> </span> <p class="shortcomment cmt">Composes two instances of Function1 in a new Function1, with this function applied last.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Composes two instances of Function1 in a new Function1, with this function applied last. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    A
   </dt>
   <dd class="cmt">
    <p>the type to which function <code>g</code> can be applied</p>
   </dd>
   <dt class="param">
    g
   </dt>
   <dd class="cmt">
    <p>a function A =&gt; T1</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a new function <code>f</code> such that <code>f(x) == apply(g(x))</code></p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../../Function1.html" class="extype" name="scala.Function1">Function1</a>
   </dd>
   <dt>
    Annotations
   </dt>
   <dd> 
    <span class="name">@<a href="../../annotation/unspecialized.html" class="extype" name="scala.annotation.unspecialized">unspecialized</a></span>
    <span class="args">()</span> 
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples















