//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#indexWhere(p:A=>Boolean,from:Int):Int">scala.collection.IndexedSeqOptimized#indexWhere</a></li>
<li name="scala.collection.IndexedSeqOptimized#indexWhere" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="indexWhere(p:A=>Boolean,from:Int):Int"></a><a id="indexWhere((A)⇒Boolean,Int):Int"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#indexWhere(p:A=>Boolean,from:Int):Int" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">indexWhere</span><span class="params">(<span name="p">p: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>) ⇒ <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span>, <span name="from">from: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span> </span> <p class="shortcomment cmt">Finds index of the first element satisfying some predicate after or at some start index.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Finds index of the first element satisfying some predicate after or at some start index.</p>
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
    <p>the start index</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the index <code>&gt;= from</code> of the first element of this sequence that satisfies the predicate <code>p</code>, or <code>-1</code>, if none exists.</p>
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



