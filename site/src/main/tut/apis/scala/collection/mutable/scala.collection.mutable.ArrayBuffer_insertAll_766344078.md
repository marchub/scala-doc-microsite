//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#insertAll(n:Int,seq:Traversable[A]):Unit">scala.collection.mutable.ArrayBuffer#insertAll</a></li>
<li name="scala.collection.mutable.ArrayBuffer#insertAll" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="insertAll(n:Int,seq:Traversable[A]):Unit"></a><a id="insertAll(Int,collection.Traversable[A]):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#insertAll(n:Int,seq:Traversable[A]):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">insertAll</span><span class="params">(<span name="n">n: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="seq">seq: <a href="../Traversable.html" class="extype" name="scala.collection.Traversable">collection.Traversable</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">Inserts new elements at the index <code>n</code>.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Inserts new elements at the index <code>n</code>. Opposed to method <code>update</code>, this method will not replace an element with a new one. Instead, it will insert a new element at index <code>n</code>. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    n
   </dt>
   <dd class="cmt">
    <p>the index where a new element will be inserted.</p>
   </dd>
   <dt class="param">
    seq
   </dt>
   <dd class="cmt">
    <p>the traversable object providing all elements to insert.</p>
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
    <span class="cmt"><p><a href="../../index.html#IndexOutOfBoundsException=IndexOutOfBoundsException" class="extmbr" name="scala.IndexOutOfBoundsException"><code>IndexOutOfBoundsException</code></a> if <code>n</code> is out of bounds.</p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples















