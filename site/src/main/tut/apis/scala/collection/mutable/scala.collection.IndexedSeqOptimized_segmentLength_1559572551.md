//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#segmentLength(p:A=>Boolean,from:Int):Int">scala.collection.IndexedSeqOptimized#segmentLength</a></li>
<li name="scala.collection.IndexedSeqOptimized#segmentLength" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="segmentLength(p:A=>Boolean,from:Int):Int"></a><a id="segmentLength((A)⇒Boolean,Int):Int"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#segmentLength(p:A=>Boolean,from:Int):Int" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">segmentLength</span><span class="params">(<span name="p">p: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>) ⇒ <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span>, <span name="from">from: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span> </span> <p class="shortcomment cmt">Computes length of longest segment whose elements all satisfy some predicate.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Computes length of longest segment whose elements all satisfy some predicate.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    p
   </dt>
   <dd class="cmt">
    <p>the predicate used to test elements.</p>
   </dd>
   <dt class="param">
    from
   </dt>
   <dd class="cmt">
    <p>the index where the search starts.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the length of the longest segment of this sequence starting from index <code>from</code> such that every element of the segment satisfies the predicate <code>p</code>.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../IndexedSeqOptimized.html" class="extype" name="scala.collection.IndexedSeqOptimized">IndexedSeqOptimized</a> → 
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
    <a href="../GenSeqLike.html" class="extype" name="scala.collection.GenSeqLike">GenSeqLike</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



