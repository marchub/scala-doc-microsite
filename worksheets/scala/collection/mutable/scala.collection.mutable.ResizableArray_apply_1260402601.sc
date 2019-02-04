//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#apply(idx:Int):A">scala.collection.mutable.ResizableArray#apply</a></li>
//<li name="scala.collection.mutable.ResizableArray#apply" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="apply(idx:Int):A"></a><a id="apply(Int):A"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#apply(idx:Int):A" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">apply</span><span class="params">(<span name="idx">idx: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span> </span> <p class="shortcomment cmt">Selects an element by its index in the mutable indexed sequence.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Selects an element by its index in the mutable indexed sequence.</p>
//   <p>Example:</p>
//   <pre>scala&gt; <span class="kw">val</span> x = <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span>, <span class="num">5</span>)
//x: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span>, <span class="num">5</span>)
//
//scala&gt; x(<span class="num">3</span>)
//res1: <span class="std">Int</span> = <span class="num">4</span></pre>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    idx
//   </dt>
//   <dd class="cmt">
//    <p>The index to select.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>the element of this mutable indexed sequence at index <code>idx</code>, where <code>0</code> indicates the first element.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="ResizableArray.html" class="extype" name="scala.collection.mutable.ResizableArray">ResizableArray</a> → 
//    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
//    <a href="../GenSeqLike.html" class="extype" name="scala.collection.GenSeqLike">GenSeqLike</a> → 
//    <a href="../../Function1.html" class="extype" name="scala.Function1">Function1</a>
//   </dd>
//   <dt>
//    Exceptions thrown
//   </dt>
//   <dd>
//    <span class="cmt"><p><a href="../../index.html#IndexOutOfBoundsException=IndexOutOfBoundsException" class="extmbr" name="scala.IndexOutOfBoundsException"><code>IndexOutOfBoundsException</code></a> if <code>idx</code> does not satisfy <code>0 &lt;= idx &lt; length</code>.</p></span>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
