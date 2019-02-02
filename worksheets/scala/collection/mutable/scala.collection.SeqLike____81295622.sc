//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#:+(elem:A):scala.collection.mutable.ArrayBuffer[A]">scala.collection.SeqLike#:+</a></li>
//<li name="scala.collection.SeqLike#:+" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id=":+(elem:A):scala.collection.mutable.ArrayBuffer[A]"></a><a id=":+(A):ArrayBuffer[A]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#:+(elem:A):scala.collection.mutable.ArrayBuffer[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $colon$plus" class="name">:+</span><span class="params">(<span name="elem">elem: <span class="extype" name="scala.collection.GenSeqLike.A">A</span></span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.GenSeqLike.A">A</span>]</span> </span> <p class="shortcomment cmt">[use case] A copy of this array buffer with an element appended.</p>
// <div class="fullcomment">
//  [use case] 
//  <div class="comment cmt">
//   <p> A copy of this array buffer with an element appended.</p>
//   <p> A mnemonic for <code>+:</code> vs. <code>:+</code> is: the COLon goes on the COLlection side.</p>
//   <p> Example:</p>
//   <pre>scala&gt; <span class="kw">val</span> a = <span class="std">List</span>(<span class="num">1</span>)
//a: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>)
//
//scala&gt; <span class="kw">val</span> b = a :+ <span class="num">2</span>
//b: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>)
//
//scala&gt; println(a)
//<span class="std">List</span>(<span class="num">1</span>)</pre>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    elem
//   </dt>
//   <dd class="cmt">
//    <p>the appended element</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a new array buffer consisting of all elements of this array buffer followed by <code>elem</code>.</p>
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
//     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $colon$plus" class="name">:+</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span name="elem">elem: <span class="extype" name="scala.collection.SeqLike.:+.B">B</span></span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <span class="extype" name="scala.collection.SeqLike.:+.B">B</span>, <span class="extype" name="scala.collection.SeqLike.:+.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.SeqLike.:+.That">That</span></span> </span> </h4>
//    </div> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---












