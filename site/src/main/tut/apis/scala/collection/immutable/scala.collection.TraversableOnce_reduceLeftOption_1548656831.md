//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#reduceLeftOption[B>:A](op:(B,A)=>B):Option[B]">scala.collection.TraversableOnce#reduceLeftOption</a></li>
<li name="scala.collection.TraversableOnce#reduceLeftOption" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="reduceLeftOption[B>:A](op:(B,A)=>B):Option[B]"></a><a id="reduceLeftOption[B>:A]((B,A)⇒B):Option[B]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#reduceLeftOption[B>:A](op:(B,A)=>B):Option[B]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">reduceLeftOption</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="op">op: (<span class="extype" name="scala.collection.TraversableOnce.reduceLeftOption.B">B</span>, <span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.TraversableOnce.reduceLeftOption.B">B</span></span>)</span><span class="result">: <a href="../../Option.html" class="extype" name="scala.Option">Option</a>[<span class="extype" name="scala.collection.TraversableOnce.reduceLeftOption.B">B</span>]</span> </span> <p class="shortcomment cmt">Optionally applies a binary operator to all elements of this traversable or iterator, going left to right.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Optionally applies a binary operator to all elements of this traversable or iterator, going left to right.</p>
   <p> Note: will not terminate for infinite-sized collections.</p>
   <p> Note: might return different results for different runs, unless the underlying collection type is ordered or the operator is associative and commutative. </p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    B
   </dt>
   <dd class="cmt">
    <p>the result type of the binary operator.</p>
   </dd>
   <dt class="param">
    op
   </dt>
   <dd class="cmt">
    <p>the binary operator.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>an option value containing the result of <code>reduceLeft(op)</code> if this traversable or iterator is nonempty, <code>None</code> otherwise.</p>
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



