//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#splitAt(n:Int):(List[A],List[A])">scala.collection.immutable.List#splitAt</a></li>
<li name="scala.collection.immutable.List#splitAt" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="splitAt(n:Int):(List[A],List[A])"></a><a id="splitAt(Int):(List[A],List[A])"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#splitAt(n:Int):(List[A],List[A])" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">splitAt</span><span class="params">(<span name="n">n: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: (<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>], <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>])</span> </span> <p class="shortcomment cmt">Splits this list into two at a given position.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Splits this list into two at a given position. Note: <code>c splitAt n</code> is equivalent to (but possibly more efficient than) <code>(c take n, c drop n)</code>.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    n
   </dt>
   <dd class="cmt">
    <p>the position at which to split.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a pair of lists consisting of the first <code>n</code> elements of this list, and the other elements.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="" class="extype" name="scala.collection.immutable.List">List</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



