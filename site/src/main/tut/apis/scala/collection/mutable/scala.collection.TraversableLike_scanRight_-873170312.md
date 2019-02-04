//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#scanRight[B,That](z:B)(op:(A,B)=>B)(implicitbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That">scala.collection.TraversableLike#scanRight</a></li>
<li name="scala.collection.TraversableLike#scanRight" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="scanRight[B,That](z:B)(op:(A,B)=>B)(implicitbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That"></a><a id="scanRight[B,That](B)((A,B)⇒B)(CanBuildFrom[ArrayBuffer[A],B,That]):That"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#scanRight[B,That](z:B)(op:(A,B)=>B)(implicitbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">scanRight</span><span class="tparams">[<span name="B">B</span>, <span name="That">That</span>]</span><span class="params">(<span name="z">z: <span class="extype" name="scala.collection.TraversableLike.scanRight.B">B</span></span>)</span><span class="params">(<span name="op">op: (<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>, <span class="extype" name="scala.collection.TraversableLike.scanRight.B">B</span>) ⇒ <span class="extype" name="scala.collection.TraversableLike.scanRight.B">B</span></span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <span class="extype" name="scala.collection.TraversableLike.scanRight.B">B</span>, <span class="extype" name="scala.collection.TraversableLike.scanRight.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableLike.scanRight.That">That</span></span> </span> <p class="shortcomment cmt">Produces a collection containing cumulative results of applying the operator going right to left.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Produces a collection containing cumulative results of applying the operator going right to left. The head of the collection is the last cumulative result.</p>
   <p> Note: will not terminate for infinite-sized collections.</p>
   <p> Note: might return different results for different runs, unless the underlying collection type is ordered.</p>
   <p> Example:</p>
   <pre><span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span>).scanRight(<span class="num">0</span>)(_ + _) == <span class="std">List</span>(<span class="num">10</span>, <span class="num">9</span>, <span class="num">7</span>, <span class="num">4</span>, <span class="num">0</span>)</pre>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    B
   </dt>
   <dd class="cmt">
    <p>the type of the elements in the resulting collection</p>
   </dd>
   <dt class="tparam">
    That
   </dt>
   <dd class="cmt">
    <p>the actual type of the resulting collection</p>
   </dd>
   <dt class="param">
    z
   </dt>
   <dd class="cmt">
    <p>the initial value</p>
   </dd>
   <dt class="param">
    op
   </dt>
   <dd class="cmt">
    <p>the binary operator applied to the intermediate result and the element</p>
   </dd>
   <dt class="param">
    bf
   </dt>
   <dd class="cmt">
    <p>an implicit value of class <code>CanBuildFrom</code> which determines the result class <code>That</code> from the current representation type <code>Repr</code> and the new element type <code>B</code>.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>collection with intermediate results</p>
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
   <dt>
    Annotations
   </dt>
   <dd> 
    <span class="name">@migration</span> 
   </dd>
   <dt>
    Migration
   </dt>
   <dd class="cmt">
    <p><i>(Changed in version 2.9.0)</i> The behavior of <code>scanRight</code> has changed. The previous behavior can be reproduced with scanRight.reverse.</p>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



