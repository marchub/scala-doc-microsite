//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#slice(from:Int,until:Int):Repr">scala.collection.IndexedSeqOptimized#slice</a></li>
<li name="scala.collection.IndexedSeqOptimized#slice" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="slice(from:Int,until:Int):Repr"></a><a id="slice(Int,Int):ArrayBuffer[A]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#slice(from:Int,until:Int):Repr" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">slice</span><span class="params">(<span name="from">from: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="until">until: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]</span> </span> <p class="shortcomment cmt">Selects an interval of elements.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Selects an interval of elements. The returned collection is made up of all elements <code>x</code> which satisfy the invariant:</p>
   <pre>from &lt;= indexOf(x) &lt; until</pre>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a sequence containing the elements greater than or equal to index <code>from</code> extending up to (but not including) index <code>until</code> of this sequence.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../IndexedSeqOptimized.html" class="extype" name="scala.collection.IndexedSeqOptimized">IndexedSeqOptimized</a> → 
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples















