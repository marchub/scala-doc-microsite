//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#sum:A">scala.collection.TraversableOnce#sum</a></li>
<li name="scala.collection.TraversableOnce#sum" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="sum:A"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#sum:A" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sum</span><span class="result">: <span class="extype" name="scala.collection.GenTraversableOnce.A">A</span></span> </span> <p class="shortcomment cmt">[use case] Sums up the elements of this collection.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Sums up the elements of this collection.</p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the sum of all elements in this array buffer of numbers of type <code>Int</code>. Instead of <code>Int</code>, any other type <code>T</code> with an implicit <code>Numeric[T]</code> implementation can be used as element type of the array buffer and as result type of <code>sum</code>. Examples of such types are: <code>Long</code>, <code>Float</code>, <code>Double</code>, <code>BigInt</code>.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
   </dd>
   <div class="full-signature-block toggleContainer"> 
    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
    <div class="hiddenContent full-signature-usecase">
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sum</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>]</span><span class="params">(<span class="implicit">implicit </span><span name="num">num: <a href="../../index.html#Numeric[T]=scala.math.Numeric[T]" class="extmbr" name="scala.Numeric">Numeric</a>[<span class="extype" name="scala.collection.TraversableOnce.sum.B">B</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableOnce.sum.B">B</span></span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples















