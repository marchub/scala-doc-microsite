//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#reverseMap[B](f:A=>B):List[B]">scala.collection.SeqLike#reverseMap</a></li>
//<li name="scala.collection.SeqLike#reverseMap" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="reverseMap[B](f:A=>B):List[B]"></a><a id="reverseMap[B]((A)⇒B):List[B]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#reverseMap[B](f:A=>B):List[B]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">reverseMap</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.GenSeqLike.A">A</span>) ⇒ <span class="extype" name="scala.collection.SeqLike.reverseMap.B">B</span></span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.SeqLike.reverseMap.B">B</span>]</span> </span> <p class="shortcomment cmt">[use case] Builds a new collection by applying a function to all elements of this list and collecting the results in reversed order.</p>
// <div class="fullcomment">
//  [use case] 
//  <div class="comment cmt">
//   <p> Builds a new collection by applying a function to all elements of this list and collecting the results in reversed order.</p>
//   <p> Note: <code>xs.reverseMap(f)</code> is the same as <code>xs.reverse.map(f)</code> but might be more efficient.</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the element type of the returned collection.</p>
//   </dd>
//   <dt class="param">
//    f
//   </dt>
//   <dd class="cmt">
//    <p>the function to apply to each element.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a new list resulting from applying the given function <code>f</code> to each element of this list and collecting the results in reversed order.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
//    <a href="../GenSeqLike.html" class="extype" name="scala.collection.GenSeqLike">GenSeqLike</a>
//   </dd>
//   <div class="full-signature-block toggleContainer"> 
//    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
//    <div class="hiddenContent full-signature-usecase">
//     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">reverseMap</span><span class="tparams">[<span name="B">B</span>, <span name="That">That</span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.SeqLike.reverseMap.B">B</span></span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>], <span class="extype" name="scala.collection.SeqLike.reverseMap.B">B</span>, <span class="extype" name="scala.collection.SeqLike.reverseMap.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.SeqLike.reverseMap.That">That</span></span> </span> </h4>
//    </div> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---


























