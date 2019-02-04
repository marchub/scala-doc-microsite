//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#++:[B>:A,That](that:Traversable[B])(implicitbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That">scala.collection.TraversableLike#++:</a></li>
//<li name="scala.collection.TraversableLike#++:" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="++:[B>:A,That](that:Traversable[B])(implicitbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That"></a><a id="++:[B>:A,That](collection.Traversable[B])(CanBuildFrom[ArrayBuffer[A],B,That]):That"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#++:[B>:A,That](that:Traversable[B])(implicitbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $plus$plus$colon" class="name">++:</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span name="that">that: <a href="../Traversable.html" class="extype" name="scala.collection.Traversable">collection.Traversable</a>[<span class="extype" name="scala.collection.TraversableLike.++:.B">B</span>]</span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <span class="extype" name="scala.collection.TraversableLike.++:.B">B</span>, <span class="extype" name="scala.collection.TraversableLike.++:.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableLike.++:.That">That</span></span> </span> <p class="shortcomment cmt">As with <code>++</code>, returns a new collection containing the elements from the left operand followed by the elements from the right operand.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>As with <code>++</code>, returns a new collection containing the elements from the left operand followed by the elements from the right operand.</p>
//   <p> It differs from <code>++</code> in that the right operand determines the type of the resulting collection rather than the left one. Mnemonic: the COLon is on the side of the new COLlection type.</p>
//   <p> Example:</p>
//   <pre>scala&gt; <span class="kw">val</span> x = <span class="std">List</span>(<span class="num">1</span>)
//x: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>)
//
//scala&gt; <span class="kw">val</span> y = LinkedList(<span class="num">2</span>)
//y: scala.collection.mutable.LinkedList[<span class="std">Int</span>] = LinkedList(<span class="num">2</span>)
//
//scala&gt; <span class="kw">val</span> z = x ++: y
//z: scala.collection.mutable.LinkedList[<span class="std">Int</span>] = LinkedList(<span class="num">1</span>, <span class="num">2</span>)</pre>
//   <p>This overload exists because: for the implementation of <code>++:</code> we should reuse that of <code>++</code> because many collections override it with more efficient versions.</p>
//   <p> Since <code>TraversableOnce</code> has no <code>++</code> method, we have to implement that directly, but <code>Traversable</code> and down can use the overload. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the element type of the returned collection.</p>
//   </dd>
//   <dt class="tparam">
//    That
//   </dt>
//   <dd class="cmt">
//    <p>the class of the returned collection. Where possible, <code>That</code> is the same class as the current collection class <code>Repr</code>, but this depends on the element type <code>B</code> being admissible for that class, which means that an implicit instance of type <code>CanBuildFrom[Repr, B, That]</code> is found.</p>
//   </dd>
//   <dt class="param">
//    that
//   </dt>
//   <dd class="cmt">
//    <p>the traversable to append.</p>
//   </dd>
//   <dt class="param">
//    bf
//   </dt>
//   <dd class="cmt">
//    <p>an implicit value of class <code>CanBuildFrom</code> which determines the result class <code>That</code> from the current representation type <code>Repr</code> and the new element type <code>B</code>.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a new collection of type <code>That</code> which contains all elements of this traversable collection followed by all elements of <code>that</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>
//   </dd>
//  </dl>
// </div> </li>
//        
//
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#++:[B](that:scala.collection.TraversableOnce[B]):scala.collection.mutable.ArrayBuffer[B]">scala.collection.TraversableLike#++:</a></li>
//<li name="scala.collection.TraversableLike#++:" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="++:[B](that:scala.collection.TraversableOnce[B]):scala.collection.mutable.ArrayBuffer[B]"></a><a id="++:[B](TraversableOnce[B]):ArrayBuffer[B]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#++:[B](that:scala.collection.TraversableOnce[B]):scala.collection.mutable.ArrayBuffer[B]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $plus$plus$colon" class="name">++:</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="that">that: <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a>[<span class="extype" name="scala.collection.TraversableLike.++:.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.TraversableLike.++:.B">B</span>]</span> </span> <p class="shortcomment cmt">[use case] As with <code>++</code>, returns a new collection containing the elements from the left operand followed by the elements from the right operand.</p>
// <div class="fullcomment">
//  [use case] 
//  <div class="comment cmt">
//   <p> As with <code>++</code>, returns a new collection containing the elements from the left operand followed by the elements from the right operand.</p>
//   <p> It differs from <code>++</code> in that the right operand determines the type of the resulting collection rather than the left one. Mnemonic: the COLon is on the side of the new COLlection type.</p>
//   <p> Example:</p>
//   <pre>scala&gt; <span class="kw">val</span> x = <span class="std">List</span>(<span class="num">1</span>)
//x: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>)
//
//scala&gt; <span class="kw">val</span> y = LinkedList(<span class="num">2</span>)
//y: scala.collection.mutable.LinkedList[<span class="std">Int</span>] = LinkedList(<span class="num">2</span>)
//
//scala&gt; <span class="kw">val</span> z = x ++: y
//z: scala.collection.mutable.LinkedList[<span class="std">Int</span>] = LinkedList(<span class="num">1</span>, <span class="num">2</span>)</pre>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="tparam">
//    B
//   </dt>
//   <dd class="cmt">
//    <p>the element type of the returned collection.</p>
//   </dd>
//   <dt class="param">
//    that
//   </dt>
//   <dd class="cmt">
//    <p>the traversable to append.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a new array buffer which contains all elements of this array buffer followed by all elements of <code>that</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a>
//   </dd>
//   <div class="full-signature-block toggleContainer"> 
//    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
//    <div class="hiddenContent full-signature-usecase">
//     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $plus$plus$colon" class="name">++:</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span name="that">that: <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a>[<span class="extype" name="scala.collection.TraversableLike.++:.B">B</span>]</span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <span class="extype" name="scala.collection.TraversableLike.++:.B">B</span>, <span class="extype" name="scala.collection.TraversableLike.++:.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableLike.++:.That">That</span></span> </span> </h4>
//    </div> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
