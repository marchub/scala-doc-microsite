//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#lastIndexOfSlice[B>:A](that:scala.collection.GenSeq[B],end:Int):Int">scala.collection.SeqLike#lastIndexOfSlice</a></li>
//<li name="scala.collection.SeqLike#lastIndexOfSlice" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="lastIndexOfSlice[B>:A](that:scala.collection.GenSeq[B],end:Int):Int"></a><a id="lastIndexOfSlice[B>:A](GenSeq[B],Int):Int"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#lastIndexOfSlice[B>:A](that:scala.collection.GenSeq[B],end:Int):Int" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">lastIndexOfSlice</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="that">that: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.SeqLike.lastIndexOfSlice.B">B</span>]</span>, <span name="end">end: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span> </span> <p class="shortcomment cmt">Finds last index before or at a given end index where this sequence contains a given sequence as a slice.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Finds last index before or at a given end index where this sequence contains a given sequence as a slice.</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    that
//   </dt>
//   <dd class="cmt">
//    <p>the sequence to test</p>
//   </dd>
//   <dt class="param">
//    end
//   </dt>
//   <dd class="cmt">
//    <p>the end index</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>the last index <code>&lt;= end</code> such that the elements of this sequence starting at this index match the elements of sequence <code>that</code>, or <code>-1</code> of no such subsequence exists.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a>
//   </dd>
//  </dl>
// </div> </li>
//        
//
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#lastIndexOfSlice[B>:A](that:scala.collection.GenSeq[B]):Int">scala.collection.SeqLike#lastIndexOfSlice</a></li>
//<li name="scala.collection.SeqLike#lastIndexOfSlice" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="lastIndexOfSlice[B>:A](that:scala.collection.GenSeq[B]):Int"></a><a id="lastIndexOfSlice[B>:A](GenSeq[B]):Int"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#lastIndexOfSlice[B>:A](that:scala.collection.GenSeq[B]):Int" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">lastIndexOfSlice</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="that">that: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.SeqLike.lastIndexOfSlice.B">B</span>]</span>)</span><span class="result">: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span> </span> <p class="shortcomment cmt">Finds last index where this sequence contains a given sequence as a slice.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Finds last index where this sequence contains a given sequence as a slice.</p>
//   <p> Note: will not terminate for infinite-sized collections. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    that
//   </dt>
//   <dd class="cmt">
//    <p>the sequence to test</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>the last index such that the elements of this sequence starting a this index match the elements of sequence <code>that</code>, or <code>-1</code> of no such subsequence exists.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
























