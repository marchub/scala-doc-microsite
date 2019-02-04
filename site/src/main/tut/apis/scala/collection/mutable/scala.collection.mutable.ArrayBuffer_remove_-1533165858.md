//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#remove(n:Int):A">scala.collection.mutable.ArrayBuffer#remove</a></li>
<li name="scala.collection.mutable.ArrayBuffer#remove" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="remove(n:Int):A"></a><a id="remove(Int):A"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#remove(n:Int):A" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">remove</span><span class="params">(<span name="n">n: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span> </span> <p class="shortcomment cmt">Removes the element at a given index position.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Removes the element at a given index position. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    n
   </dt>
   <dd class="cmt">
    <p>the index which refers to the element to delete.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the element that was formerly at position <code>n</code>.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a> → 
    <a href="BufferLike.html" class="extype" name="scala.collection.mutable.BufferLike">BufferLike</a>
   </dd>
  </dl>
 </div> </li>
        

<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#remove(n:Int,count:Int):Unit">scala.collection.mutable.ArrayBuffer#remove</a></li>
<li name="scala.collection.mutable.ArrayBuffer#remove" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="remove(n:Int,count:Int):Unit"></a><a id="remove(Int,Int):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#remove(n:Int,count:Int):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">remove</span><span class="params">(<span name="n">n: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="count">count: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">Removes the element on a given index position.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Removes the element on a given index position. It takes time linear in the buffer size. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    n
   </dt>
   <dd class="cmt">
    <p>the index which refers to the first element to remove.</p>
   </dd>
   <dt class="param">
    count
   </dt>
   <dd class="cmt">
    <p>the number of elements to remove.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a> → 
    <a href="BufferLike.html" class="extype" name="scala.collection.mutable.BufferLike">BufferLike</a>
   </dd>
   <dt>
    Exceptions thrown
   </dt>
   <dd>
    <span class="cmt"><p><a href="../../index.html#IllegalArgumentException=IllegalArgumentException" class="extmbr" name="scala.IllegalArgumentException"><code>IllegalArgumentException</code></a> if <code>count &lt; 0</code>.</p></span>
    <span class="cmt"><p><a href="../../index.html#IndexOutOfBoundsException=IndexOutOfBoundsException" class="extmbr" name="scala.IndexOutOfBoundsException"><code>IndexOutOfBoundsException</code></a> if the index <code>n</code> is not in the valid range <code>0 &lt;= n &lt;= length - count</code> (with <code>count &gt; 0</code>).</p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



