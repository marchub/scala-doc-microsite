//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#reduce[A1>:A](op:(A1,A1)=>A1):A1">scala.collection.TraversableOnce#reduce</a></li>
<li name="scala.collection.TraversableOnce#reduce" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="reduce[A1>:A](op:(A1,A1)=>A1):A1"></a><a id="reduce[A1>:A]((A1,A1)⇒A1):A1"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#reduce[A1>:A](op:(A1,A1)=>A1):A1" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">reduce</span><span class="tparams">[<span name="A1">A1 &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="op">op: (<span class="extype" name="scala.collection.TraversableOnce.reduce.A1">A1</span>, <span class="extype" name="scala.collection.TraversableOnce.reduce.A1">A1</span>) ⇒ <span class="extype" name="scala.collection.TraversableOnce.reduce.A1">A1</span></span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableOnce.reduce.A1">A1</span></span> </span> <p class="shortcomment cmt">Reduces the elements of this traversable or iterator using the specified associative binary operator.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Reduces the elements of this traversable or iterator using the specified associative binary operator.</p>
   <p> The order in which operations are performed on elements is unspecified and may be nondeterministic. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    A1
   </dt>
   <dd class="cmt">
    <p>A type parameter for the binary operator, a supertype of <code>A</code>.</p>
   </dd>
   <dt class="param">
    op
   </dt>
   <dd class="cmt">
    <p>A binary operator that must be associative.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>The result of applying reduce operator <code>op</code> between all the elements if the traversable or iterator is nonempty.</p>
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
   <dt>
    Exceptions thrown
   </dt>
   <dd>
    <span class="cmt"><p><a href="../../index.html#UnsupportedOperationException=UnsupportedOperationException" class="extmbr" name="scala.UnsupportedOperationException"><code>UnsupportedOperationException</code></a> if this traversable or iterator is empty.</p></span>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



