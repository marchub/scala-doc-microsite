//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#collect[B](pf:PartialFunction[A,B]):scala.collection.mutable.ArrayBuffer[B]">scala.collection.TraversableLike#collect</a></li>
//<li name="scala.collection.TraversableLike#collect" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="collect[B](pf:PartialFunction[A,B]):scala.collection.mutable.ArrayBuffer[B]"></a><a id="collect[B](PartialFunction[A,B]):ArrayBuffer[B]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#collect[B](pf:PartialFunction[A,B]):scala.collection.mutable.ArrayBuffer[B]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">collect</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="pf">pf: <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a>[<span class="extype" name="scala.collection.GenTraversableLike.A">A</span>, <span class="extype" name="scala.collection.TraversableLike.collect.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.TraversableLike.collect.B">B</span>]</span> </span> <p class="shortcomment cmt">[use case] Builds a new collection by applying a partial function to all elements of this array buffer on which the function is defined.</p>
// <div class="fullcomment">
//  [use case] 
//  <div class="comment cmt">
//   <p> Builds a new collection by applying a partial function to all elements of this array buffer on which the function is defined.</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the element type of the returned collection.</p>
//   </dd>
//   <dt class="param">
//    pf
//   </dt>
//   <dd class="cmt">
//    <p>the partial function which filters and maps the array buffer.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a new array buffer resulting from applying the given partial function <code>pf</code> to each element on which it is defined and collecting the results. The order of the elements is preserved.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
//    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
//   </dd>
//   <div class="full-signature-block toggleContainer"> 
//    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
//    <div class="hiddenContent full-signature-usecase">
//     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">collect</span><span class="tparams">[<span name="B">B</span>, <span name="That">That</span>]</span><span class="params">(<span name="pf">pf: <a href="../../PartialFunction.html" class="extype" name="scala.PartialFunction">PartialFunction</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>, <span class="extype" name="scala.collection.TraversableLike.collect.B">B</span>]</span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <span class="extype" name="scala.collection.TraversableLike.collect.B">B</span>, <span class="extype" name="scala.collection.TraversableLike.collect.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableLike.collect.That">That</span></span> </span> </h4>
//    </div> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
