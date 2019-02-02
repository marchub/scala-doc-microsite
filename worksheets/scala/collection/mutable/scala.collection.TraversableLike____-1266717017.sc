//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#++[B>:A,That](that:scala.collection.GenTraversableOnce[B])(implicitbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That">scala.collection.TraversableLike#++</a></li>
//<li name="scala.collection.TraversableLike#++" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="++[B>:A,That](that:scala.collection.GenTraversableOnce[B])(implicitbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That"></a><a id="++[B>:A,That](GenTraversableOnce[B])(CanBuildFrom[ArrayBuffer[A],B,That]):That"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#++[B>:A,That](that:scala.collection.GenTraversableOnce[B])(implicitbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $plus$plus" class="name">++</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span name="that">that: <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>[<span class="extype" name="scala.collection.TraversableLike.++.B">B</span>]</span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>], <span class="extype" name="scala.collection.TraversableLike.++.B">B</span>, <span class="extype" name="scala.collection.TraversableLike.++.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.TraversableLike.++.That">That</span></span> </span> <p class="shortcomment cmt">Returns a new traversable collection containing the elements from the left hand operand followed by the elements from the right hand operand.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Returns a new traversable collection containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the traversable collection is the most specific superclass encompassing the element types of the two operands. </p>
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
//    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
//    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---












