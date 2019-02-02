//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#reduceRight[B>:A](op:(A,B)=>B):B">scala.collection.IndexedSeqOptimized#reduceRight</a></li>
<li name="scala.collection.IndexedSeqOptimized#reduceRight" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="reduceRight[B>:A](op:(A,B)=>B):B"></a><a id="reduceRight[B>:A]((A,B)⇒B):B"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#reduceRight[B>:A](op:(A,B)=>B):B" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">reduceRight</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>]</span><span class="params">(<span name="op">op: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>, <span class="extype" name="scala.collection.IndexedSeqOptimized.reduceRight.B">B</span>) ⇒ <span class="extype" name="scala.collection.IndexedSeqOptimized.reduceRight.B">B</span></span>)</span><span class="result">: <span class="extype" name="scala.collection.IndexedSeqOptimized.reduceRight.B">B</span></span> </span> <p class="shortcomment cmt">Applies a binary operator to all elements of this sequence, going right to left.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Applies a binary operator to all elements of this sequence, going right to left.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    B
   </dt>
   <dd class="cmt">
    <p>the result type of the binary operator.</p>
   </dd>
   <dt class="param">
    op
   </dt>
   <dd class="cmt">
    <p>the binary operator.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the result of inserting <code>op</code> between consecutive elements of this sequence, going right to left:</p>
    <pre>op(x_1, op(x_2, ..., op(x_{n-<span class="num">1</span>}, x_n)...))</pre>
    <p> where <code>x<sub>1</sub>, ..., x<sub>n</sub></code> are the elements of this sequence.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../IndexedSeqOptimized.html" class="extype" name="scala.collection.IndexedSeqOptimized">IndexedSeqOptimized</a> → 
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
   </dd>
   <dt>
    Exceptions thrown
   </dt>
   <dd>
    <span class="cmt"><p><a href="../../index.html#UnsupportedOperationException=UnsupportedOperationException" class="extmbr" name="scala.UnsupportedOperationException"><code>UnsupportedOperationException</code></a> if this sequence is empty.</p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples















