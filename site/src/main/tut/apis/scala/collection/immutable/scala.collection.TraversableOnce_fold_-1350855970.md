//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1">scala.collection.TraversableOnce#fold</a></li>
<li name="scala.collection.TraversableOnce#fold" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1"></a><a id="fold[A1>:A](A1)((A1,A1)⇒A1):A1"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#fold[A1>:A](z:A1)(op:(A1,A1)=>A1):A1" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">fold</span><span class="tparams">[<span name="A1">A1 &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="z">z: <span class="extype" name="scala.collection.TraversableOnce.fold.A1">A1</span></span>)</span><span class="params">(<span name="op">op: (<span class="extype" name="scala.collection.TraversableOnce.fold.A1">A1</span>, <span class="extype" name="scala.collection.TraversableOnce.fold.A1">A1</span>) ⇒ <span class="extype" name="scala.collection.TraversableOnce.fold.A1">A1</span></span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableOnce.fold.A1">A1</span></span> </span> <p class="shortcomment cmt">Folds the elements of this traversable or iterator using the specified associative binary operator.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Folds the elements of this traversable or iterator using the specified associative binary operator.</p>
   <p> The order in which operations are performed on elements is unspecified and may be nondeterministic.</p>
   <p> Note: will not terminate for infinite-sized collections. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    A1
   </dt>
   <dd class="cmt">
    <p>a type parameter for the binary operator, a supertype of <code>A</code>.</p>
   </dd>
   <dt class="param">
    z
   </dt>
   <dd class="cmt">
    <p>a neutral element for the fold operation; may be added to the result an arbitrary number of times, and must not change the result (e.g., <code>Nil</code> for list concatenation, 0 for addition, or 1 for multiplication).</p>
   </dd>
   <dt class="param">
    op
   </dt>
   <dd class="cmt">
    <p>a binary operator that must be associative.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the result of applying the fold operator <code>op</code> between all the elements and <code>z</code>, or <code>z</code> if this traversable or iterator is empty.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



