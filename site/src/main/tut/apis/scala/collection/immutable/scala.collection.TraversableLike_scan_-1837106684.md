//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#scan[B>:A,That](z:B)(op:(B,B)=>B)(implicitcbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That">scala.collection.TraversableLike#scan</a></li>
<li name="scala.collection.TraversableLike#scan" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="scan[B>:A,That](z:B)(op:(B,B)=>B)(implicitcbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That"></a><a id="scan[B>:A,That](B)((B,B)⇒B)(CanBuildFrom[List[A],B,That]):That"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#scan[B>:A,That](z:B)(op:(B,B)=>B)(implicitcbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">scan</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span name="z">z: <span class="extype" name="scala.collection.TraversableLike.scan.B">B</span></span>)</span><span class="params">(<span name="op">op: (<span class="extype" name="scala.collection.TraversableLike.scan.B">B</span>, <span class="extype" name="scala.collection.TraversableLike.scan.B">B</span>) ⇒ <span class="extype" name="scala.collection.TraversableLike.scan.B">B</span></span>)</span><span class="params">(<span class="implicit">implicit </span><span name="cbf">cbf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>], <span class="extype" name="scala.collection.TraversableLike.scan.B">B</span>, <span class="extype" name="scala.collection.TraversableLike.scan.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableLike.scan.That">That</span></span> </span> <p class="shortcomment cmt">Computes a prefix scan of the elements of the collection.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Computes a prefix scan of the elements of the collection.</p>
   <p> Note: The neutral element <code>z</code> may be applied more than once. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    B
   </dt>
   <dd class="cmt">
    <p>element type of the resulting collection</p>
   </dd>
   <dt class="tparam">
    That
   </dt>
   <dd class="cmt">
    <p>type of the resulting collection</p>
   </dd>
   <dt class="param">
    z
   </dt>
   <dd class="cmt">
    <p>neutral element for the operator <code>op</code></p>
   </dd>
   <dt class="param">
    op
   </dt>
   <dd class="cmt">
    <p>the associative operator for the scan</p>
   </dd>
   <dt class="param">
    cbf
   </dt>
   <dd class="cmt">
    <p>combiner factory which provides a combiner</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a new traversable collection containing the prefix scan of the elements in this traversable collection</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



