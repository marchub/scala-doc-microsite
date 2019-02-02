//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#++[B>:A,That](that:scala.collection.GenTraversableOnce[B])(implicitbf:scala.collection.generic.CanBuildFrom[List[A],B,That]):That">scala.collection.immutable.List#++</a></li>
//<li name="scala.collection.immutable.List#++" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="++[B>:A,That](that:scala.collection.GenTraversableOnce[B])(implicitbf:scala.collection.generic.CanBuildFrom[List[A],B,That]):That"></a><a id="++[B>:A,That](GenTraversableOnce[B])(CanBuildFrom[List[A],B,That]):That"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#++[B>:A,That](that:scala.collection.GenTraversableOnce[B])(implicitbf:scala.collection.generic.CanBuildFrom[List[A],B,That]):That" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $plus$plus" class="name">++</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span name="that">that: <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>[<span class="extype" name="scala.collection.immutable.List.++.B">B</span>]</span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>], <span class="extype" name="scala.collection.immutable.List.++.B">B</span>, <span class="extype" name="scala.collection.immutable.List.++.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.immutable.List.++.That">That</span></span> </span> <p class="shortcomment cmt">Returns a new list containing the elements from the left hand operand followed by the elements from the right hand operand.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Returns a new list containing the elements from the left hand operand followed by the elements from the right hand operand. The element type of the list is the most specific superclass encompassing the element types of the two operands. </p>
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
//    <p>the class of the returned collection. In the standard library configuration, <code>That</code> is always <code>List[B]</code> because an implicit of type <code>CanBuildFrom[List, B, That]</code> is defined in object <code>List</code>.</p>
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
//    <p>an implicit value of class <code>CanBuildFrom</code> which determines the result class <code>That</code> from the current representation type <code>Repr</code> and the new element type <code>B</code>. This is usually the <code>canBuildFrom</code> value defined in object <code>List</code>.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a new collection of type <code>That</code> which contains all elements of this list followed by all elements of <code>that</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="" class="extype" name="scala.collection.immutable.List">List</a> → 
//    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
//    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
//   </dd>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
























