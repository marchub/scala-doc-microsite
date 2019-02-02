//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#view(from:Int,until:Int):scala.collection.mutable.IndexedSeqView[A,Repr]">scala.collection.mutable.IndexedSeqLike#view</a></li>
<li name="scala.collection.mutable.IndexedSeqLike#view" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="view(from:Int,until:Int):scala.collection.mutable.IndexedSeqView[A,Repr]"></a><a id="view(Int,Int):IndexedSeqView[A,ArrayBuffer[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#view(from:Int,until:Int):scala.collection.mutable.IndexedSeqView[A,Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">view</span><span class="params">(<span name="from">from: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="until">until: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="IndexedSeqView.html" class="extype" name="scala.collection.mutable.IndexedSeqView">IndexedSeqView</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>, <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]]</span> </span> <p class="shortcomment cmt">A sub-sequence view starting at index <code>from</code> and extending up to (but not including) index <code>until</code>.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>A sub-sequence view starting at index <code>from</code> and extending up to (but not including) index <code>until</code>. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    from
   </dt>
   <dd class="cmt">
    <p>The index of the first element of the slice</p>
   </dd>
   <dt class="param">
    until
   </dt>
   <dd class="cmt">
    <p>The index of the element following the slice</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a non-strict view of a slice of this mutable indexed sequence, starting at index <code>from</code> and extending up to (but not including) index <code>until</code>.@note The difference between <code>view</code> and <code>slice</code> is that <code>view</code> produces a view of the current sequence, whereas <code>slice</code> produces a new sequence.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="IndexedSeqLike.html" class="extype" name="scala.collection.mutable.IndexedSeqLike">IndexedSeqLike</a> → 
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>
   </dd>
   <dt>
    Note
   </dt>
   <dd>
    <span class="cmt"><p>view(from, to) is equivalent to view.slice(from, to)</p></span>
   </dd>
  </dl>
 </div> </li>
        

<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#view:scala.collection.mutable.IndexedSeqView[A,Repr]">scala.collection.mutable.IndexedSeqLike#view</a></li>
<li name="scala.collection.mutable.IndexedSeqLike#view" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="view:scala.collection.mutable.IndexedSeqView[A,Repr]"></a><a id="view:IndexedSeqView[A,ArrayBuffer[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#view:scala.collection.mutable.IndexedSeqView[A,Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">view</span><span class="result">: <a href="IndexedSeqView.html" class="extype" name="scala.collection.mutable.IndexedSeqView">IndexedSeqView</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>, <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]]</span> </span> <p class="shortcomment cmt">Creates a view of this iterable @see Iterable.View</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Creates a view of this iterable @see Iterable.View</p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a non-strict view of this mutable indexed sequence.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="IndexedSeqLike.html" class="extype" name="scala.collection.mutable.IndexedSeqLike">IndexedSeqLike</a> → 
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples















