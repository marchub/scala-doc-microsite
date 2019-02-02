//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#sizeHintBounded(size:Int,boundingColl:scala.collection.TraversableLike[_,_]):Unit">scala.collection.mutable.Builder#sizeHintBounded</a></li>
<li name="scala.collection.mutable.Builder#sizeHintBounded" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="sizeHintBounded(size:Int,boundingColl:scala.collection.TraversableLike[_,_]):Unit"></a><a id="sizeHintBounded(Int,TraversableLike[_,_]):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#sizeHintBounded(size:Int,boundingColl:scala.collection.TraversableLike[_,_]):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sizeHintBounded</span><span class="params">(<span name="size">size: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="boundingColl">boundingColl: <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>[_, _]</span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">Gives a hint how many elements are expected to be added when the next <code>result</code> is called, together with an upper bound given by the size of some other collection.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Gives a hint how many elements are expected to be added when the next <code>result</code> is called, together with an upper bound given by the size of some other collection. Some builder classes will optimize their representation based on the hint. However, builder implementations are still required to work correctly even if the hint is wrong, i.e. a different number of elements is added. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    size
   </dt>
   <dd class="cmt">
    <p>the hint how many elements will be added.</p>
   </dd>
   <dt class="param">
    boundingColl
   </dt>
   <dd class="cmt">
    <p>the bounding collection. If it is an IndexedSeqLike, then sizes larger than collection's size are reduced.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="Builder.html" class="extype" name="scala.collection.mutable.Builder">Builder</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples















