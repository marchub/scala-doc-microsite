//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#startsWith[B](that:scala.collection.GenSeq[B],offset:Int):Boolean">scala.collection.IndexedSeqOptimized#startsWith</a></li>
<li name="scala.collection.IndexedSeqOptimized#startsWith" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="startsWith[B](that:scala.collection.GenSeq[B],offset:Int):Boolean"></a><a id="startsWith[B](GenSeq[B],Int):Boolean"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#startsWith[B](that:scala.collection.GenSeq[B],offset:Int):Boolean" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">startsWith</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="that">that: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.IndexedSeqOptimized.startsWith.B">B</span>]</span>, <span name="offset">offset: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span> </span> <p class="shortcomment cmt">Tests whether this sequence contains the given sequence at a given index.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Tests whether this sequence contains the given sequence at a given index.</p>
   <p><b>Note</b>: If the both the receiver object <code>this</code> and the argument <code>that</code> are infinite sequences this method may not terminate. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    that
   </dt>
   <dd class="cmt">
    <p>the sequence to test</p>
   </dd>
   <dt class="param">
    offset
   </dt>
   <dd class="cmt">
    <p>the index where the sequence is searched.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p><code>true</code> if the sequence <code>that</code> is contained in this sequence at index <code>offset</code>, otherwise <code>false</code>.</p>
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



