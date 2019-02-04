//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#toMap[T,U]:scala.collection.Map[T,U]">scala.collection.TraversableOnce#toMap</a></li>
<li name="scala.collection.TraversableOnce#toMap" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="toMap[T,U]:scala.collection.Map[T,U]"></a><a id="toMap[T,U]:collection.Map[T,U]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#toMap[T,U]:scala.collection.Map[T,U]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">toMap</span><span class="tparams">[<span name="T">T</span>, <span name="U">U</span>]</span><span class="result">: <a href="../Map.html" class="extype" name="scala.collection.Map">collection.Map</a>[<span class="extype" name="scala.collection.TraversableOnce.toMap.T">T</span>, <span class="extype" name="scala.collection.TraversableOnce.toMap.U">U</span>]</span> </span> <p class="shortcomment cmt">[use case] Converts this array buffer to a map.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Converts this array buffer to a map. This method is unavailable unless the elements are members of Tuple2, each ((T, U)) becoming a key-value pair in the map. Duplicate keys will be overwritten by later keys: if this is an unordered collection, which key is in the resulting map is undefined.</p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a map of type <code>immutable.Map[T, U]</code> containing all key/value pairs of type <code>(T, U)</code> of this array buffer.</p>
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
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">toMap</span><span class="tparams">[<span name="T">T</span>, <span name="U">U</span>]</span><span class="params">(<span class="implicit">implicit </span><span name="ev">ev: <a href="../../Predef$$$less$colon$less.html" class="extype" name="scala.Predef.<:<">&lt;:&lt;</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>, (<span class="extype" name="scala.collection.TraversableOnce.toMap.T">T</span>, <span class="extype" name="scala.collection.TraversableOnce.toMap.U">U</span>)]</span>)</span><span class="result">: <a href="../immutable/Map.html" class="extype" name="scala.collection.immutable.Map">immutable.Map</a>[<span class="extype" name="scala.collection.TraversableOnce.toMap.T">T</span>, <span class="extype" name="scala.collection.TraversableOnce.toMap.U">U</span>]</span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



