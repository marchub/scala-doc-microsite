//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#patch(from:Int,that:scala.collection.GenSeq[A],replaced:Int):List[A]">scala.collection.SeqLike#patch</a></li>
<li name="scala.collection.SeqLike#patch" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="patch(from:Int,that:scala.collection.GenSeq[A],replaced:Int):List[A]"></a><a id="patch(Int,GenSeq[A],Int):List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#patch(from:Int,that:scala.collection.GenSeq[A],replaced:Int):List[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">patch</span><span class="params">(<span name="from">from: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="that">that: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.GenSeqLike.A">A</span>]</span>, <span name="replaced">replaced: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.GenSeqLike.A">A</span>]</span> </span> <p class="shortcomment cmt">[use case] Produces a new list where a slice of elements in this list is replaced by another sequence.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Produces a new list where a slice of elements in this list is replaced by another sequence.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    from
   </dt>
   <dd class="cmt">
    <p>the index of the first replaced element</p>
   </dd>
   <dt class="param">
    replaced
   </dt>
   <dd class="cmt">
    <p>the number of elements to drop in the original list</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a new list consisting of all elements of this list except that <code>replaced</code> elements starting from <code>from</code> are replaced by <code>patch</code>.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
    <a href="../GenSeqLike.html" class="extype" name="scala.collection.GenSeqLike">GenSeqLike</a>
   </dd>
   <div class="full-signature-block toggleContainer"> 
    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
    <div class="hiddenContent full-signature-usecase">
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">patch</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span name="from">from: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="patch">patch: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.SeqLike.patch.B">B</span>]</span>, <span name="replaced">replaced: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>], <span class="extype" name="scala.collection.SeqLike.patch.B">B</span>, <span class="extype" name="scala.collection.SeqLike.patch.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.SeqLike.patch.That">That</span></span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



