//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#foreach(f:A=>Unit):Unit">scala.collection.immutable.List#foreach</a></li>
<li name="scala.collection.immutable.List#foreach" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="foreach(f:A=>Unit):Unit"></a><a id="foreach((A)⇒Unit):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#foreach(f:A=>Unit):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier">final </span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">foreach</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.IterableLike.A">A</span>) ⇒ <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">[use case] Applies a function <code>f</code> to all elements of this list.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Applies a function <code>f</code> to all elements of this list.</p>
   <p> Note: this method underlies the implementation of most other bulk operations. Subclasses should re-implement this method if a more efficient implementation exists.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    f
   </dt>
   <dd class="cmt">
    <p>the function that is applied for its side-effect to every element. The result of function <code>f</code> is discarded.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="" class="extype" name="scala.collection.immutable.List">List</a> → 
    <a href="../LinearSeqOptimized.html" class="extype" name="scala.collection.LinearSeqOptimized">LinearSeqOptimized</a> → 
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../generic/GenericTraversableTemplate.html" class="extype" name="scala.collection.generic.GenericTraversableTemplate">GenericTraversableTemplate</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a> → 
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a> → 
    <a href="../generic/FilterMonadic.html" class="extype" name="scala.collection.generic.FilterMonadic">FilterMonadic</a>
   </dd>
   <div class="full-signature-block toggleContainer"> 
    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
    <div class="hiddenContent full-signature-usecase">
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier">final </span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">foreach</span><span class="tparams">[<span name="U">U</span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.immutable.List.foreach.U">U</span></span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



