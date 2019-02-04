//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#mapResult[NewTo](f:To=>NewTo):scala.collection.mutable.Builder[Elem,NewTo]">scala.collection.mutable.Builder#mapResult</a></li>
<li name="scala.collection.mutable.Builder#mapResult" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="mapResult[NewTo](f:To=>NewTo):scala.collection.mutable.Builder[Elem,NewTo]"></a><a id="mapResult[NewTo]((ArrayBuffer[A])⇒NewTo):Builder[A,NewTo]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#mapResult[NewTo](f:To=>NewTo):scala.collection.mutable.Builder[Elem,NewTo]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">mapResult</span><span class="tparams">[<span name="NewTo">NewTo</span>]</span><span class="params">(<span name="f">f: (<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]) ⇒ <span class="extype" name="scala.collection.mutable.Builder.mapResult.NewTo">NewTo</span></span>)</span><span class="result">: <a href="Builder.html" class="extype" name="scala.collection.mutable.Builder">Builder</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>, <span class="extype" name="scala.collection.mutable.Builder.mapResult.NewTo">NewTo</span>]</span> </span> <p class="shortcomment cmt">Creates a new builder by applying a transformation function to the results of this builder.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Creates a new builder by applying a transformation function to the results of this builder.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    NewTo
   </dt>
   <dd class="cmt">
    <p>the type of collection returned by <code>f</code>.</p>
   </dd>
   <dt class="param">
    f
   </dt>
   <dd class="cmt">
    <p>the transformation function.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a new builder which is the same as the current builder except that a transformation function is applied to this builder's result.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="Builder.html" class="extype" name="scala.collection.mutable.Builder">Builder</a>
   </dd>
   <dt>
    Note
   </dt>
   <dd>
    <span class="cmt"><p>The original builder should no longer be used after <code>mapResult</code> is called.</p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



