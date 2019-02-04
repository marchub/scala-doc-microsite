//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#intersect(that:Seq[A]):scala.collection.mutable.ArrayBuffer[A]">scala.collection.SeqLike#intersect</a></li>
<li name="scala.collection.SeqLike#intersect" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="intersect(that:Seq[A]):scala.collection.mutable.ArrayBuffer[A]"></a><a id="intersect(collection.Seq[A]):ArrayBuffer[A]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#intersect(that:Seq[A]):scala.collection.mutable.ArrayBuffer[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">intersect</span><span class="params">(<span name="that">that: <a href="../Seq.html" class="extype" name="scala.collection.Seq">collection.Seq</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span> </span> <p class="shortcomment cmt">[use case] Computes the multiset intersection between this array buffer and another sequence.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Computes the multiset intersection between this array buffer and another sequence.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    that
   </dt>
   <dd class="cmt">
    <p>the sequence of elements to intersect with.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a new array buffer which contains all elements of this array buffer which also appear in <code>that</code>. If an element value <code>x</code> appears <i>n</i> times in <code>that</code>, then the first <i>n</i> occurrences of <code>x</code> will be retained in the result, but any following occurrences will be omitted.</p>
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
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">intersect</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>]</span><span class="params">(<span name="that">that: <a href="../GenSeq.html" class="extype" name="scala.collection.GenSeq">GenSeq</a>[<span class="extype" name="scala.collection.SeqLike.intersect.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



