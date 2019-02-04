//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#isDefinedAt(idx:Int):Boolean">scala.collection.GenSeqLike#isDefinedAt</a></li>
<li name="scala.collection.GenSeqLike#isDefinedAt" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="isDefinedAt(idx:Int):Boolean"></a><a id="isDefinedAt(Int):Boolean"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#isDefinedAt(idx:Int):Boolean" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">isDefinedAt</span><span class="params">(<span name="idx">idx: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span> </span> <p class="shortcomment cmt">Tests whether this general sequence contains given index.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Tests whether this general sequence contains given index.</p>
   <p> The implementations of methods <code>apply</code> and <code>isDefinedAt</code> turn a <code>Seq[A]</code> into a <code>PartialFunction[Int, A]</code>. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    idx
   </dt>
   <dd class="cmt">
    <p>the index to test</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p><code>true</code> if this general sequence contains an element at position <code>idx</code>, <code>false</code> otherwise.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../GenSeqLike.html" class="extype" name="scala.collection.GenSeqLike">GenSeqLike</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



