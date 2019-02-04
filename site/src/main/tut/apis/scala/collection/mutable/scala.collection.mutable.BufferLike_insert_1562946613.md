//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#insert(n:Int,elems:A*):Unit">scala.collection.mutable.BufferLike#insert</a></li>
<li name="scala.collection.mutable.BufferLike#insert" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="insert(n:Int,elems:A*):Unit"></a><a id="insert(Int,A*):Unit"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#insert(n:Int,elems:A*):Unit" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">insert</span><span class="params">(<span name="n">n: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="elems">elems: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>*</span>)</span><span class="result">: <a href="../../Unit.html" class="extype" name="scala.Unit">Unit</a></span> </span> <p class="shortcomment cmt">Inserts new elements at a given index into this buffer.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Inserts new elements at a given index into this buffer. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    n
   </dt>
   <dd class="cmt">
    <p>the index where new elements are inserted.</p>
   </dd>
   <dt class="param">
    elems
   </dt>
   <dd class="cmt">
    <p>the traversable collection containing the elements to insert.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="BufferLike.html" class="extype" name="scala.collection.mutable.BufferLike">BufferLike</a>
   </dd>
   <dt>
    Exceptions thrown
   </dt>
   <dd>
    <span class="cmt"><p><a href="../../index.html#IndexOutOfBoundsException=IndexOutOfBoundsException" class="extmbr" name="scala.IndexOutOfBoundsException"><code>IndexOutOfBoundsException</code></a> if the index <code>n</code> is not in the valid range <code>0 &lt;= n &lt;= length</code>.</p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



