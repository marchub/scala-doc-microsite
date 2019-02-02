//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#sliding(size:Int,step:Int):Iterator[Repr]">scala.collection.IterableLike#sliding</a></li>
//<li name="scala.collection.IterableLike#sliding" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="sliding(size:Int,step:Int):Iterator[Repr]"></a><a id="sliding(Int,Int):Iterator[ArrayBuffer[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#sliding(size:Int,step:Int):Iterator[Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sliding</span><span class="params">(<span name="size">size: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="step">step: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../Iterator.html" class="extype" name="scala.collection.Iterator">Iterator</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]]</span> </span> <p class="shortcomment cmt">Groups elements in fixed size blocks by passing a "sliding window" over them (as opposed to partitioning them, as is done in grouped.)</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Groups elements in fixed size blocks by passing a "sliding window" over them (as opposed to partitioning them, as is done in grouped.)</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    size
//   </dt>
//   <dd class="cmt">
//    <p>the number of elements per group</p>
//   </dd>
//   <dt class="param">
//    step
//   </dt>
//   <dd class="cmt">
//    <p>the distance between the first elements of successive groups</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>An iterator producing iterable collections of size <code>size</code>, except the last element (which may be the only element) will be truncated if there are fewer than <code>size</code> elements remaining to be grouped.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a>
//   </dd>
//   <dt>
//    See also
//   </dt>
//   <dd>
//    <span class="cmt"><p><a href="../Iterator.html" class="extype" name="scala.collection.Iterator">scala.collection.Iterator</a>, method <code>sliding</code></p></span>
//   </dd>
//  </dl>
// </div> </li>
//        
//
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#sliding(size:Int):Iterator[Repr]">scala.collection.IterableLike#sliding</a></li>
//<li name="scala.collection.IterableLike#sliding" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="sliding(size:Int):Iterator[Repr]"></a><a id="sliding(Int):Iterator[ArrayBuffer[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#sliding(size:Int):Iterator[Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sliding</span><span class="params">(<span name="size">size: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../Iterator.html" class="extype" name="scala.collection.Iterator">Iterator</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]]</span> </span> <p class="shortcomment cmt">Groups elements in fixed size blocks by passing a "sliding window" over them (as opposed to partitioning them, as is done in <code>grouped</code>.) The "sliding window" step is set to one.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Groups elements in fixed size blocks by passing a "sliding window" over them (as opposed to partitioning them, as is done in <code>grouped</code>.) The "sliding window" step is set to one.</p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    size
//   </dt>
//   <dd class="cmt">
//    <p>the number of elements per group</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>An iterator producing iterable collections of size <code>size</code>, except the last element (which may be the only element) will be truncated if there are fewer than <code>size</code> elements remaining to be grouped.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a>
//   </dd>
//   <dt>
//    See also
//   </dt>
//   <dd>
//    <span class="cmt"><p><a href="../Iterator.html" class="extype" name="scala.collection.Iterator">scala.collection.Iterator</a>, method <code>sliding</code></p></span>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---












