//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#indexOfSlice[B>:A](that:scala.collection.GenSeq[B],from:Int):Int">scala.collection.SeqLike#indexOfSlice</a></li>
<li name="scala.collection.SeqLike#indexOfSlice" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="indexOfSlice[B>:A](that:scala.collection.GenSeq[B],from:Int):Int"></a><a id="indexOfSlice[B>:A](GenSeq[B],Int):Int"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#indexOfSlice[B>:A](that:scala.collection.GenSeq[B],from:Int):Int" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">indexOfSlice</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="that">that: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.SeqLike.indexOfSlice.B">B</span>]</span>, <span name="from">from: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span> </span> <p class="shortcomment cmt">Finds first index after or at a start index where this sequence contains a given sequence as a slice.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Finds first index after or at a start index where this sequence contains a given sequence as a slice.</p>
   <p> Note: may not terminate for infinite-sized collections.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    that
   </dt>
   <dd class="cmt">
    <p>the sequence to test</p>
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
    <p>the first index <code>&gt;= from</code> such that the elements of this sequence starting at this index match the elements of sequence <code>that</code>, or <code>-1</code> of no such subsequence exists.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a>
   </dd>
  </dl>
 </div> </li>
        

<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#indexOfSlice[B>:A](that:scala.collection.GenSeq[B]):Int">scala.collection.SeqLike#indexOfSlice</a></li>
<li name="scala.collection.SeqLike#indexOfSlice" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="indexOfSlice[B>:A](that:scala.collection.GenSeq[B]):Int"></a><a id="indexOfSlice[B>:A](GenSeq[B]):Int"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#indexOfSlice[B>:A](that:scala.collection.GenSeq[B]):Int" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">indexOfSlice</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="that">that: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.SeqLike.indexOfSlice.B">B</span>]</span>)</span><span class="result">: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span> </span> <p class="shortcomment cmt">Finds first index where this sequence contains a given sequence as a slice.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Finds first index where this sequence contains a given sequence as a slice.</p>
   <p> Note: may not terminate for infinite-sized collections.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    that
   </dt>
   <dd class="cmt">
    <p>the sequence to test</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the first index such that the elements of this sequence starting at this index match the elements of sequence <code>that</code>, or <code>-1</code> of no such subsequence exists.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



