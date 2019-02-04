//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#copyToArray(xs:Array[A]):Unit">scala.collection.TraversableOnce#copyToArray</a></li>
<li name="scala.collection.TraversableOnce#copyToArray" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="copyToArray(xs:Array[A]):Unit"></a><a id="copyToArray(Array[A]):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#copyToArray(xs:Array[A]):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">copyToArray</span><span class="params">(<span name="xs">xs: <a href="../../Array.html" class="extype" name="scala.Array">Array</a>[<span class="extype" name="scala.collection.GenTraversableOnce.A">A</span>]</span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">[use case] Copies the elements of this array buffer to an array.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Copies the elements of this array buffer to an array. Fills the given array <code>xs</code> with values of this array buffer. Copying will stop once either the end of the current array buffer is reached, or the end of the target array is reached.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    xs
   </dt>
   <dd class="cmt">
    <p>the array to fill.</p>
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
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">copyToArray</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>]</span><span class="params">(<span name="xs">xs: <a href="../../Array.html" class="extype" name="scala.Array">Array</a>[<span class="extype" name="scala.collection.TraversableOnce.copyToArray.B">B</span>]</span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        

<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#copyToArray(xs:Array[A],start:Int):Unit">scala.collection.TraversableOnce#copyToArray</a></li>
<li name="scala.collection.TraversableOnce#copyToArray" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="copyToArray(xs:Array[A],start:Int):Unit"></a><a id="copyToArray(Array[A],Int):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#copyToArray(xs:Array[A],start:Int):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">copyToArray</span><span class="params">(<span name="xs">xs: <a href="../../Array.html" class="extype" name="scala.Array">Array</a>[<span class="extype" name="scala.collection.GenTraversableOnce.A">A</span>]</span>, <span name="start">start: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">[use case] Copies the elements of this array buffer to an array.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Copies the elements of this array buffer to an array. Fills the given array <code>xs</code> with values of this array buffer, beginning at index <code>start</code>. Copying will stop once either the end of the current array buffer is reached, or the end of the target array is reached.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    xs
   </dt>
   <dd class="cmt">
    <p>the array to fill.</p>
   </dd>
   <dt class="param">
    start
   </dt>
   <dd class="cmt">
    <p>the starting index.</p>
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
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">copyToArray</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>]</span><span class="params">(<span name="xs">xs: <a href="../../Array.html" class="extype" name="scala.Array">Array</a>[<span class="extype" name="scala.collection.TraversableOnce.copyToArray.B">B</span>]</span>, <span name="start">start: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



