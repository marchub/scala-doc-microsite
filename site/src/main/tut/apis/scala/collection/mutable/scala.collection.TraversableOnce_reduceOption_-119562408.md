//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#reduceOption[A1>:A](op:(A1,A1)=>A1):Option[A1]">scala.collection.TraversableOnce#reduceOption</a></li>
<li name="scala.collection.TraversableOnce#reduceOption" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="reduceOption[A1>:A](op:(A1,A1)=>A1):Option[A1]"></a><a id="reduceOption[A1>:A]((A1,A1)⇒A1):Option[A1]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#reduceOption[A1>:A](op:(A1,A1)=>A1):Option[A1]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">reduceOption</span><span class="tparams">[<span name="A1">A1 &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>]</span><span class="params">(<span name="op">op: (<span class="extype" name="scala.collection.TraversableOnce.reduceOption.A1">A1</span>, <span class="extype" name="scala.collection.TraversableOnce.reduceOption.A1">A1</span>) ⇒ <span class="extype" name="scala.collection.TraversableOnce.reduceOption.A1">A1</span></span>)</span><span class="result">: <a href="../../Option.html" class="extype" name="scala.Option">Option</a>[<span class="extype" name="scala.collection.TraversableOnce.reduceOption.A1">A1</span>]</span> </span> <p class="shortcomment cmt">Reduces the elements of this traversable or iterator, if any, using the specified associative binary operator.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Reduces the elements of this traversable or iterator, if any, using the specified associative binary operator.</p>
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
    <p>An option value containing result of applying reduce operator <code>op</code> between all the elements if the collection is nonempty, and <code>None</code> otherwise.</p>
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















