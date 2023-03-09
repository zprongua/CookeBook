import React from 'react'

function Header() {
    return (
        <div className="logo row">
            <div className="col-2"></div>
            <div className="col text-start">
                <div className="logo row">
                    <div className="col-4 text-start"><img src="../logo.png" alt="Cook-e-Book" /></div>
                    <div className="col">
                        An online cookbook to help you keep track of recipes and ingredients in your pantry, making cooking a breeze.
                    </div>
                </div>
            </div>
            <div className="col-2"></div>
        </div>
    )
}

export default Header
