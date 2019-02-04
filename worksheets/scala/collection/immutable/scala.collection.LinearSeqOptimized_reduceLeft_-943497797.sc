//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#reduceLeft[B>:A](op:(B,A)=>B):B">scala.collection.LinearSeqOptimized#reduceLeft</a></li>
//<li name="scala.collection.LinearSeqOptimized#reduceLeft" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="reduceLeft[B>:A](op:(B,A)=>B):B"></a><a id="reduceLeft[B>:A]((B,A)⇒B):B"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#reduceLeft[B>:A](op:(B,A)=>B):B" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">reduceLeft</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="op">op: (<span class="extype" name="scala.collection.LinearSeqOptimized.reduceLeft.B">B</span>, <span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.LinearSeqOptimized.reduceLeft.B">B</span></span>)</span><span class="result">: <span class="extype" name="scala.collection.LinearSeqOptimized.reduceLeft.B">B</span></span> </span> <p class="shortcomment cmt">Applies a binary operator to all elements of this sequence, going left to right.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Applies a binary operator to all elements of this sequence, going left to right.</p>
//   <p> Note: will not terminate for infinite-sized collections.</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the result type of the binary operator.</p>
//   </dd>
//   <dt class="param">
//    op
//   </dt>
//   <dd class="cmt">
//    <p>the binary operator.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>the result of inserting <code>op</code> between consecutive elements of this sequence, going left to right:</p>
//    <pre>op( op( ... op(x_1, x_2) ..., x_{n-<span class="num">1</span>}), x_n)</pre>
//    <p> where <code>x<sub>1</sub>, ..., x<sub>n</sub></code> are the elements of this sequence.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../LinearSeqOptimized.html" class="extype" name="scala.collection.LinearSeqOptimized">LinearSeqOptimized</a> → 
//    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a>
//   </dd>
//   <dt>
//    Exceptions thrown
//   </dt>
//   <dd>
//    <span class="cmt"><p><a href="../../index.html#UnsupportedOperationException=UnsupportedOperationException" class="extmbr" name="scala.UnsupportedOperationException"><code>UnsupportedOperationException</code></a> if this sequence is empty.</p></span>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
