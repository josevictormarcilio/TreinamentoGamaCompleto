context('Robo para site do Itaú', () => {
  beforeEach(() => {
    cy.visit('http://www.itau.com.br')
  })

  it('Deve preencher uma ag e conta e pesquisar', () => {
    cy.get('input#agencia').type('3235')
    cy.get('input#conta').type('32351-2')
    cy.get('#btnLoginSubmit').click()
    cy.get('.alert-success').should("to.have.length", 1)
    cy.get('.alert-danger').should("to.have.length", 0)
  })
})