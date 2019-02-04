//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#lengthCompare(len:Int):Int">scala.collection.LinearSeqOptimized#lengthCompare</a></li>
//<li name="scala.collection.LinearSeqOptimized#lengthCompare" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="lengthCompare(len:Int):Int"></a><a id="lengthCompare(Int):Int"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#lengthCompare(len:Int):Int" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">lengthCompare</span><span class="params">(<span name="len">len: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span> </span> <p class="shortcomment cmt">Compares the length of this sequence to a test value.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Compares the length of this sequence to a test value. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    len
//   </dt>
//   <dd class="cmt">
//    <p>the test value that gets compared with the length.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>A value <code>x</code> where</p>
//    <pre>x &lt;  <span class="num">0</span>       <span class="kw">if</span> <span class="kw">this</span>.length &lt;  len
//x == <span class="num">0</span>       <span class="kw">if</span> <span class="kw">this</span>.length == len
//x &gt;  <span class="num">0</span>       <span class="kw">if</span> <span class="kw">this</span>.length &gt;  len</pre>
//    <p> The method as implemented here does not call <code>length</code> directly; its running time is <code>O(length min len)</code> instead of <code>O(length)</code>. The method should be overwritten if computing <code>length</code> is cheap.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../LinearSeqOptimized.html" class="extype" name="scala.collection.LinearSeqOptimized">LinearSeqOptimized</a> → 
//    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
