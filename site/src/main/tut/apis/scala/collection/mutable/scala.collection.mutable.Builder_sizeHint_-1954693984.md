//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#sizeHint(coll:scala.collection.TraversableLike[_,_],delta:Int):Unit">scala.collection.mutable.Builder#sizeHint</a></li>
<li name="scala.collection.mutable.Builder#sizeHint" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="sizeHint(coll:scala.collection.TraversableLike[_,_],delta:Int):Unit"></a><a id="sizeHint(TraversableLike[_,_],Int):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#sizeHint(coll:scala.collection.TraversableLike[_,_],delta:Int):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sizeHint</span><span class="params">(<span name="coll">coll: <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>[_, _]</span>, <span name="delta">delta: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">Gives a hint that one expects the <code>result</code> of this builder to have the same size as the given collection, plus some delta.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Gives a hint that one expects the <code>result</code> of this builder to have the same size as the given collection, plus some delta. This will provide a hint only if the collection is known to have a cheap <code>size</code> method. Currently this is assumed to be the case if and only if the collection is of type <code>IndexedSeqLike</code>. Some builder classes will optimize their representation based on the hint. However, builder implementations are still required to work correctly even if the hint is wrong, i.e. a different number of elements is added. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    coll
   </dt>
   <dd class="cmt">
    <p>the collection which serves as a hint for the result's size.</p>
   </dd>
   <dt class="param">
    delta
   </dt>
   <dd class="cmt">
    <p>a correction to add to the <code>coll.size</code> to produce the size hint.</p>
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
        

<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#sizeHint(coll:scala.collection.TraversableLike[_,_]):Unit">scala.collection.mutable.Builder#sizeHint</a></li>
<li name="scala.collection.mutable.Builder#sizeHint" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="sizeHint(coll:scala.collection.TraversableLike[_,_]):Unit"></a><a id="sizeHint(TraversableLike[_,_]):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#sizeHint(coll:scala.collection.TraversableLike[_,_]):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sizeHint</span><span class="params">(<span name="coll">coll: <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>[_, _]</span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">Gives a hint that one expects the <code>result</code> of this builder to have the same size as the given collection, plus some delta.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Gives a hint that one expects the <code>result</code> of this builder to have the same size as the given collection, plus some delta. This will provide a hint only if the collection is known to have a cheap <code>size</code> method, which is determined by calling <code>sizeHint</code>.</p>
   <p> Some builder classes will optimize their representation based on the hint. However, builder implementations are still required to work correctly even if the hint is wrong, i.e. a different number of elements is added. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    coll
   </dt>
   <dd class="cmt">
    <p>the collection which serves as a hint for the result's size.</p>
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















