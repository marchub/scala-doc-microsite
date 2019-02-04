//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#partition(p:A=>Boolean):(Repr,Repr)">scala.collection.TraversableLike#partition</a></li>
<li name="scala.collection.TraversableLike#partition" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="partition(p:A=>Boolean):(Repr,Repr)"></a><a id="partition((A)⇒Boolean):(ArrayBuffer[A],ArrayBuffer[A])"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#partition(p:A=>Boolean):(Repr,Repr)" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">partition</span><span class="params">(<span name="p">p: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>) ⇒ <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span>)</span><span class="result">: (<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>])</span> </span> <p class="shortcomment cmt">Partitions this traversable collection in two traversable collections according to a predicate.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Partitions this traversable collection in two traversable collections according to a predicate. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    p
   </dt>
   <dd class="cmt">
    <p>the predicate on which to partition.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a pair of traversable collections: the first traversable collection consists of all elements that satisfy the predicate <code>p</code> and the second traversable collection consists of all elements that don't. The relative order of the elements in the resulting traversable collections is the same as in the original traversable collection.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



