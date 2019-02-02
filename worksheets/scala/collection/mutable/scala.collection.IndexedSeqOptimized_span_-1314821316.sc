//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#span(p:A=>Boolean):(Repr,Repr)">scala.collection.IndexedSeqOptimized#span</a></li>
//<li name="scala.collection.IndexedSeqOptimized#span" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="span(p:A=>Boolean):(Repr,Repr)"></a><a id="span((A)⇒Boolean):(ArrayBuffer[A],ArrayBuffer[A])"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#span(p:A=>Boolean):(Repr,Repr)" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">span</span><span class="params">(<span name="p">p: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>) ⇒ <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span>)</span><span class="result">: (<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>])</span> </span> <p class="shortcomment cmt">Splits this sequence into a prefix/suffix pair according to a predicate.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Splits this sequence into a prefix/suffix pair according to a predicate.</p>
//   <p> Note: <code>c span p</code> is equivalent to (but possibly more efficient than) <code>(c takeWhile p, c dropWhile p)</code>, provided the evaluation of the predicate <code>p</code> does not cause any side-effects.</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a pair consisting of the longest prefix of this sequence whose elements all satisfy <code>p</code>, and the rest of this sequence.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../IndexedSeqOptimized.html" class="extype" name="scala.collection.IndexedSeqOptimized">IndexedSeqOptimized</a> → 
//    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
//    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---












