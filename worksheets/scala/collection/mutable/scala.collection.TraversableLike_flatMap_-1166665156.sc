//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#flatMap[B](f:A=>scala.collection.GenTraversableOnce[B]):scala.collection.mutable.ArrayBuffer[B]">scala.collection.TraversableLike#flatMap</a></li>
//<li name="scala.collection.TraversableLike#flatMap" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="flatMap[B](f:A=>scala.collection.GenTraversableOnce[B]):scala.collection.mutable.ArrayBuffer[B]"></a><a id="flatMap[B]((A)⇒GenTraversableOnce[B]):ArrayBuffer[B]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#flatMap[B](f:A=>scala.collection.GenTraversableOnce[B]):scala.collection.mutable.ArrayBuffer[B]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">flatMap</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.GenTraversableLike.A">A</span>) ⇒ <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>[<span class="extype" name="scala.collection.TraversableLike.flatMap.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.TraversableLike.flatMap.B">B</span>]</span> </span> <p class="shortcomment cmt">[use case] Builds a new collection by applying a function to all elements of this array buffer and using the elements of the resulting collections.</p>
// <div class="fullcomment">
//  [use case] 
//  <div class="comment cmt">
//   <p> Builds a new collection by applying a function to all elements of this array buffer and using the elements of the resulting collections.</p>
//   <p> For example:</p>
//   <pre><span class="kw">def</span> getWords(lines: <span class="std">Seq</span>[<span class="std">String</span>]): <span class="std">Seq</span>[<span class="std">String</span>] = lines flatMap (line <span class="kw">=&gt;</span> line split <span class="lit">"\\W+"</span>)</pre>
//   <p> The type of the resulting collection is guided by the static type of array buffer. This might cause unexpected results sometimes. For example:</p>
//   <pre><span class="cmt">// lettersOf will return a Seq[Char] of likely repeated letters, instead of a Set</span>
//<span class="kw">def</span> lettersOf(words: <span class="std">Seq</span>[<span class="std">String</span>]) = words flatMap (word <span class="kw">=&gt;</span> word.toSet)
//
//<span class="cmt">// lettersOf will return a Set[Char], not a Seq</span>
//<span class="kw">def</span> lettersOf(words: <span class="std">Seq</span>[<span class="std">String</span>]) = words.toSet flatMap (word <span class="kw">=&gt;</span> word.toSeq)
//
//<span class="cmt">// xs will be an Iterable[Int]</span>
//<span class="kw">val</span> xs = <span class="std">Map</span>(<span class="lit">"a"</span> -&gt; <span class="std">List</span>(<span class="num">11</span>,<span class="num">111</span>), <span class="lit">"b"</span> -&gt; <span class="std">List</span>(<span class="num">22</span>,<span class="num">222</span>)).flatMap(_._2)
//
//<span class="cmt">// ys will be a Map[Int, Int]</span>
//<span class="kw">val</span> ys = <span class="std">Map</span>(<span class="lit">"a"</span> -&gt; <span class="std">List</span>(<span class="num">1</span> -&gt; <span class="num">11</span>,<span class="num">1</span> -&gt; <span class="num">111</span>), <span class="lit">"b"</span> -&gt; <span class="std">List</span>(<span class="num">2</span> -&gt; <span class="num">22</span>,<span class="num">2</span> -&gt; <span class="num">222</span>)).flatMap(_._2)</pre>
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
//    <p>a new array buffer resulting from applying the given collection-valued function <code>f</code> to each element of this array buffer and concatenating the results.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
//    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a> → 
//    <a href="../generic/FilterMonadic.html" class="extype" name="scala.collection.generic.FilterMonadic">FilterMonadic</a>
//   </dd>
//   <div class="full-signature-block toggleContainer"> 
//    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
//    <div class="hiddenContent full-signature-usecase">
//     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">flatMap</span><span class="tparams">[<span name="B">B</span>, <span name="That">That</span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>) ⇒ <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>[<span class="extype" name="scala.collection.TraversableLike.flatMap.B">B</span>]</span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <span class="extype" name="scala.collection.TraversableLike.flatMap.B">B</span>, <span class="extype" name="scala.collection.TraversableLike.flatMap.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableLike.flatMap.That">That</span></span> </span> </h4>
//    </div> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
