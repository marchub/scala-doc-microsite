//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#runWith[U](action:B=>U):A=>Boolean">scala.PartialFunction#runWith</a></li>
<li name="scala.PartialFunction#runWith" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="runWith[U](action:B=>U):A=>Boolean"></a><a id="runWith[U]((A)⇒U):(Int)⇒Boolean"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#runWith[U](action:B=>U):A=>Boolean" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">runWith</span><span class="tparams">[<span name="U">U</span>]</span><span class="params">(<span name="action">action: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>) ⇒ <span class="extype" name="scala.PartialFunction.runWith.U">U</span></span>)</span><span class="result">: (<a href="../../Int.html" class="extype" name="scala.Int">Int</a>) ⇒ <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span> </span> <p class="shortcomment cmt">Composes this partial function with an action function which gets applied to results of this partial function.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Composes this partial function with an action function which gets applied to results of this partial function. The action function is invoked only for its side effects; its result is ignored.</p>
   <p> Note that expression <code>pf.runWith(action)(x)</code> is equivalent to</p>
   <pre><span class="kw">if</span>(pf isDefinedAt x) { action(pf(x)); <span class="kw">true</span> } <span class="kw">else</span> <span class="kw">false</span></pre>
   <p> except that <code>runWith</code> is implemented via <code>applyOrElse</code> and thus potentially more efficient. Using <code>runWith</code> avoids double evaluation of pattern matchers and guards for partial function literals.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    action
   </dt>
   <dd class="cmt">
    <p>the action function</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a function which maps arguments <code>x</code> to <code>isDefinedAt(x)</code>. The resulting function runs <code>action(this(x))</code> where <code>this</code> is defined.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a>
   </dd>
   <dt>
    Since
   </dt>
   <dd>
    <p>2.10</p>
   </dd>
   <dt>
    See also
   </dt>
   <dd>
    <span class="cmt"><p><code>applyOrElse</code>.</p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples















