//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#unzip[A1,A2](implicitasPair:A=>(A1,A2)):(CC[A1],CC[A2])">scala.collection.generic.GenericTraversableTemplate#unzip</a></li>
//<li name="scala.collection.generic.GenericTraversableTemplate#unzip" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="unzip[A1,A2](implicitasPair:A=>(A1,A2)):(CC[A1],CC[A2])"></a><a id="unzip[A1,A2]((A)⇒(A1,A2)):(ArrayBuffer[A1],ArrayBuffer[A2])"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#unzip[A1,A2](implicitasPair:A=>(A1,A2)):(CC[A1],CC[A2])" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">unzip</span><span class="tparams">[<span name="A1">A1</span>, <span name="A2">A2</span>]</span><span class="params">(<span class="implicit">implicit </span><span name="asPair">asPair: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>) ⇒ (<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip.A1">A1</span>, <span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip.A2">A2</span>)</span>)</span><span class="result">: (<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip.A1">A1</span>], <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip.A2">A2</span>])</span> </span> <p class="shortcomment cmt">Converts this collection of pairs into two collections of the first and second half of each pair.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Converts this collection of pairs into two collections of the first and second half of each pair.</p>
//   <pre><span class="kw">val</span> xs = Traversable(
//           (<span class="num">1</span>, <span class="lit">"one"</span>),
//           (<span class="num">2</span>, <span class="lit">"two"</span>),
//           (<span class="num">3</span>, <span class="lit">"three"</span>)).unzip
//<span class="cmt">// xs == (Traversable(1, 2, 3),</span>
//<span class="cmt">//        Traversable(one, two, three))</span></pre>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    A1
//   </dt>
//   <dd class="cmt">
//    <p>the type of the first half of the element pairs</p>
//   </dd>
//   <dt class="tparam">
//    A2
//   </dt>
//   <dd class="cmt">
//    <p>the type of the second half of the element pairs</p>
//   </dd>
//   <dt class="param">
//    asPair
//   </dt>
//   <dd class="cmt">
//    <p>an implicit conversion which asserts that the element type of this collection is a pair.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a pair of collections, containing the first, respectively second half of each element pair of this collection.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../generic/GenericTraversableTemplate.html" class="extype" name="scala.collection.generic.GenericTraversableTemplate">GenericTraversableTemplate</a>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
