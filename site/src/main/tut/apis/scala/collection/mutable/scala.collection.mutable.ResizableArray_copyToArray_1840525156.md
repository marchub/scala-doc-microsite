//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#copyToArray[B>:A](xs:Array[B],start:Int,len:Int):Unit">scala.collection.mutable.ResizableArray#copyToArray</a></li>
<li name="scala.collection.mutable.ResizableArray#copyToArray" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="copyToArray[B>:A](xs:Array[B],start:Int,len:Int):Unit"></a><a id="copyToArray[B>:A](Array[B],Int,Int):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#copyToArray[B>:A](xs:Array[B],start:Int,len:Int):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">copyToArray</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>]</span><span class="params">(<span name="xs">xs: <a href="../../Array.html" class="extype" name="scala.Array">Array</a>[<span class="extype" name="scala.collection.mutable.ResizableArray.copyToArray.B">B</span>]</span>, <span name="start">start: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="len">len: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">Fills the given array <code>xs</code> with at most <code>len</code> elements of this traversable starting at position <code>start</code>.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Fills the given array <code>xs</code> with at most <code>len</code> elements of this traversable starting at position <code>start</code>.</p>
   <p> Copying will stop once either the end of the current traversable is reached or <code>len</code> elements have been copied or the end of the array is reached. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    B
   </dt>
   <dd class="cmt">
    <p>the type of the elements of the target array.</p>
   </dd>
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
    <p>starting index.</p>
   </dd>
   <dt class="param">
    len
   </dt>
   <dd class="cmt">
    <p>number of elements to copy</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="ResizableArray.html" class="extype" name="scala.collection.mutable.ResizableArray">ResizableArray</a> → 
    <a href="../IndexedSeqOptimized.html" class="extype" name="scala.collection.IndexedSeqOptimized">IndexedSeqOptimized</a> → 
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



