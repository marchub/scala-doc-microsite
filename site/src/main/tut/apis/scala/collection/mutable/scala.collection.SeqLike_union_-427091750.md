//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#union(that:Seq[A]):scala.collection.mutable.ArrayBuffer[A]">scala.collection.SeqLike#union</a></li>
<li name="scala.collection.SeqLike#union" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="union(that:Seq[A]):scala.collection.mutable.ArrayBuffer[A]"></a><a id="union(collection.Seq[A]):ArrayBuffer[A]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#union(that:Seq[A]):scala.collection.mutable.ArrayBuffer[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">union</span><span class="params">(<span name="that">that: <a href="../Seq.html" class="extype" name="scala.collection.Seq">collection.Seq</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span> </span> <p class="shortcomment cmt">[use case] Produces a new sequence which contains all elements of this array buffer and also all elements of a given sequence.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Produces a new sequence which contains all elements of this array buffer and also all elements of a given sequence. <code>xs union ys</code> is equivalent to <code>xs ++ ys</code>.</p>
   <p> Another way to express this is that <code>xs union ys</code> computes the order-preserving multi-set union of <code>xs</code> and <code>ys</code>. <code>union</code> is hence a counter-part of <code>diff</code> and <code>intersect</code> which also work on multi-sets.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    that
   </dt>
   <dd class="cmt">
    <p>the sequence to add.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a new array buffer which contains all elements of this array buffer followed by all elements of <code>that</code>.</p>
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
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">union</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span name="that">that: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.SeqLike.union.B">B</span>]</span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <span class="extype" name="scala.collection.SeqLike.union.B">B</span>, <span class="extype" name="scala.collection.SeqLike.union.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.SeqLike.union.That">That</span></span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



