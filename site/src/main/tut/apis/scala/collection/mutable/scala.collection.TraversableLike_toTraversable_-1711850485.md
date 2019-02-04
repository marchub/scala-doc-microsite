//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#toTraversable:Traversable[A]">scala.collection.TraversableLike#toTraversable</a></li>
<li name="scala.collection.TraversableLike#toTraversable" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="toTraversable:Traversable[A]"></a><a id="toTraversable:collection.Traversable[A]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#toTraversable:Traversable[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">toTraversable</span><span class="result">: <a href="../Traversable.html" class="extype" name="scala.collection.Traversable">collection.Traversable</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span> </span> <p class="shortcomment cmt">Converts this traversable collection to an unspecified Traversable.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Converts this traversable collection to an unspecified Traversable. Will return the same collection if this instance is already Traversable.</p>
   <p> Note: will not terminate for infinite-sized collections. </p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a Traversable containing all elements of this traversable collection.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
   </dd>
   <dt>
    Annotations
   </dt>
   <dd> 
    <span class="name">@<a href="../../deprecatedOverriding.html" class="extype" name="scala.deprecatedOverriding">deprecatedOverriding</a></span>
    <span class="args">(<span> message = <span class="defval" name="&quot;Enforce contract of toTraversable that if it is Traversable it returns itself.&quot;">...</span> </span>, <span> since = <span class="symbol">"2.11.0"</span> </span>)</span> 
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



