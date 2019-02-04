//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#groupBy[K](f:A=>K):scala.collection.immutable.Map[K,Repr]">scala.collection.TraversableLike#groupBy</a></li>
//<li name="scala.collection.TraversableLike#groupBy" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="groupBy[K](f:A=>K):scala.collection.immutable.Map[K,Repr]"></a><a id="groupBy[K]((A)⇒K):Map[K,List[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#groupBy[K](f:A=>K):scala.collection.immutable.Map[K,Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">groupBy</span><span class="tparams">[<span name="K">K</span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.TraversableLike.groupBy.K">K</span></span>)</span><span class="result">: <a href="Map.html" class="extype" name="scala.collection.immutable.Map">Map</a>[<span class="extype" name="scala.collection.TraversableLike.groupBy.K">K</span>, <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]]</span> </span> <p class="shortcomment cmt">Partitions this traversable collection into a map of traversable collections according to some discriminator function.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Partitions this traversable collection into a map of traversable collections according to some discriminator function.</p>
//   <p> Note: this method is not re-implemented by views. This means when applied to a view it will always force the view and return a new traversable collection. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    K
//   </dt>
//   <dd class="cmt">
//    <p>the type of keys returned by the discriminator function.</p>
//   </dd>
//   <dt class="param">
//    f
//   </dt>
//   <dd class="cmt">
//    <p>the discriminator function.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>A map from keys to traversable collections such that the following invariant holds:</p>
//    <pre>(xs groupBy f)(k) = xs filter (x <span class="kw">=&gt;</span> f(x) == k)</pre>
//    <p> That is, every key <code>k</code> is bound to a traversable collection of those elements <code>x</code> for which <code>f(x)</code> equals <code>k</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
//    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
