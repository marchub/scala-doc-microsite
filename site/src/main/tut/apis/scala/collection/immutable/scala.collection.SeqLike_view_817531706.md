//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#view(from:Int,until:Int):scala.collection.SeqView[A,Repr]">scala.collection.SeqLike#view</a></li>
<li name="scala.collection.SeqLike#view" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="view(from:Int,until:Int):scala.collection.SeqView[A,Repr]"></a><a id="view(Int,Int):SeqView[A,List[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#view(from:Int,until:Int):scala.collection.SeqView[A,Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">view</span><span class="params">(<span name="from">from: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="until">until: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../SeqView.html" class="extype" name="scala.collection.SeqView">SeqView</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>, <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]]</span> </span> <p class="shortcomment cmt">Creates a non-strict view of a slice of this sequence.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Creates a non-strict view of a slice of this sequence.</p>
   <p> Note: the difference between <code>view</code> and <code>slice</code> is that <code>view</code> produces a view of the current sequence, whereas <code>slice</code> produces a new sequence.</p>
   <p> Note: <code>view(from, to)</code> is equivalent to <code>view.slice(from, to)</code></p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    from
   </dt>
   <dd class="cmt">
    <p>the index of the first element of the view</p>
   </dd>
   <dt class="param">
    until
   </dt>
   <dd class="cmt">
    <p>the index of the element following the view</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a non-strict view of a slice of this sequence, starting at index <code>from</code> and extending up to (but not including) index <code>until</code>.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>
   </dd>
  </dl>
 </div> </li>
        

<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#view:scala.collection.SeqView[A,Repr]">scala.collection.SeqLike#view</a></li>
<li name="scala.collection.SeqLike#view" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="view:scala.collection.SeqView[A,Repr]"></a><a id="view:SeqView[A,List[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#view:scala.collection.SeqView[A,Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">view</span><span class="result">: <a href="../SeqView.html" class="extype" name="scala.collection.SeqView">SeqView</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>, <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]]</span> </span> <p class="shortcomment cmt">Creates a non-strict view of this sequence.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Creates a non-strict view of this sequence. </p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a non-strict view of this sequence.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



























