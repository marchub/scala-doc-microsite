//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#hasDefiniteSize:Boolean">scala.collection.TraversableLike#hasDefiniteSize</a></li>
<li name="scala.collection.TraversableLike#hasDefiniteSize" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="hasDefiniteSize:Boolean"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#hasDefiniteSize:Boolean" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">hasDefiniteSize</span><span class="result">: <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span> </span> <p class="shortcomment cmt">Tests whether this traversable collection is known to have a finite size.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Tests whether this traversable collection is known to have a finite size. All strict collections are known to have finite size. For a non-strict collection such as <code>Stream</code>, the predicate returns <code><b>true</b></code> if all elements have been computed. It returns <code><b>false</b></code> if the stream is not yet evaluated to the end. Non-empty Iterators usually return <code><b>false</b></code> even if they were created from a collection with a known finite size.</p>
   <p> Note: many collection methods will not work on collections of infinite sizes. The typical failure mode is an infinite loop. These methods always attempt a traversal without checking first that <code>hasDefiniteSize</code> returns <code><b>true</b></code>. However, checking <code>hasDefiniteSize</code> can provide an assurance that size is well-defined and non-termination is not a concern. </p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p><code><b>true</b></code> if this collection is known to have finite size, <code><b>false</b></code> otherwise.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples















