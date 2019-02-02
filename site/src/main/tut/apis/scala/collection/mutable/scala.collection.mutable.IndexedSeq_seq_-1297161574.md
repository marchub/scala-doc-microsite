//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#seq:scala.collection.mutable.IndexedSeq[A]">scala.collection.mutable.IndexedSeq#seq</a></li>
<li name="scala.collection.mutable.IndexedSeq#seq" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="seq:scala.collection.mutable.IndexedSeq[A]"></a><a id="seq:IndexedSeq[A]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#seq:scala.collection.mutable.IndexedSeq[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">seq</span><span class="result">: <a href="IndexedSeq.html" class="extype" name="scala.collection.mutable.IndexedSeq">IndexedSeq</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span> </span> <p class="shortcomment cmt">A version of this collection with all of the operations implemented sequentially (i.e., in a single-threaded manner).</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>A version of this collection with all of the operations implemented sequentially (i.e., in a single-threaded manner).</p>
   <p> This method returns a reference to this collection. In parallel collections, it is redefined to return a sequential implementation of this collection. In both cases, it has O(1) complexity. </p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a sequential view of the collection.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="IndexedSeq.html" class="extype" name="scala.collection.mutable.IndexedSeq">IndexedSeq</a> → 
    <a href="../IndexedSeq.html" class="extype" name="scala.collection.IndexedSeq">IndexedSeq</a> → 
    <a href="../IndexedSeqLike.html" class="extype" name="scala.collection.IndexedSeqLike">IndexedSeqLike</a> → 
    <a href="Seq.html" class="extype" name="scala.collection.mutable.Seq">Seq</a> → 
    <a href="../Seq.html" class="extype" name="scala.collection.Seq">Seq</a> → 
    <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a> → 
    <a href="../GenSeqLike.html" class="extype" name="scala.collection.GenSeqLike">GenSeqLike</a> → 
    <a href="Iterable.html" class="extype" name="scala.collection.mutable.Iterable">Iterable</a> → 
    <a href="../Iterable.html" class="extype" name="scala.collection.Iterable">Iterable</a> → 
    <a href="../GenIterable.html" class="extype" name="scala.collection.GenIterable">GenIterable</a> → 
    <a href="Traversable.html" class="extype" name="scala.collection.mutable.Traversable">Traversable</a> → 
    <a href="../Traversable.html" class="extype" name="scala.collection.Traversable">Traversable</a> → 
    <a href="../GenTraversable.html" class="extype" name="scala.collection.GenTraversable">GenTraversable</a> → 
    <a href="../Parallelizable.html" class="extype" name="scala.collection.Parallelizable">Parallelizable</a> → 
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples















